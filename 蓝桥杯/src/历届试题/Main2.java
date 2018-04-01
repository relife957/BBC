package 历届试题;

import java.util.Scanner;

public class Main2 {
	static char[] dirs = {'U','R','D','L'};
	public static char nextdir(char dir) {
		for(int i = 0 ; i < dirs.length ;i++) {
			if(dirs[i]==dir) {
				return i==dirs.length-1?dirs[0]:dirs[i+1];
			}
		}
		return '0' ;
	}
	public static char predir(char dir) {
		for(int i = 0 ; i < dirs.length ;i++) {
			if(dirs[i]==dir) {
				return i==0?dirs[dirs.length-1]:dirs[i-1];
			}
		}
		return '0' ;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();   	//行数
		int n = scan.nextInt();		//列数
		int[][] nums = new int[n][m] ;
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ;j<n ;j++) {
				nums[j][i] =scan.nextInt();
			}
		}
		int x = scan.next().charAt(0)-'0';
		int y = scan.next().charAt(0)-'0';
		char dir = scan.next().charAt(0);
		int k = Integer.valueOf(scan.next());
		scan.close();
		//System.out.println(nums[0][1]);
		for(int i = 0 ; i < k ; i++) {
			if(nums[y][x] == 1) {
				dir = nextdir(dir);
				nums[y][x] = 0 ;
			}else if(nums[y][x]==0){
				dir = predir(dir);
				nums[y][x] = 1 ;
			}
			//System.out.println(dir);
			switch(dir) {
				case 'U':
					if(x!=0) {
						x--;
					}
					break ;
				case 'R':
					if(y!=n-1) {
						y++;
					}
					break ;
				case 'L':
					if(y!=0) {
						y--;
					}
					break ;
				case 'D':
					if(x!=m-1) {
						x++;
					}
					break ;
				default:
					break ;
			}
		}
		System.out.println(x+" "+y);
	}
}
