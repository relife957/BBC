package 历届试题;

import java.util.Scanner;

public class Main7_2 {
	static int[][][][] ways ;
	static int[][] cs ;
	static final int MOD = 1000000007 ;
	static int n,m,k;
	public static int f(int x,int y,int num,int max) {
		if(ways[x][y][num][max+1]!=-1) {
			return ways[x][y][num][max+1] ;
		}
		int t = 0 ;
		if(x==m-1&&y==n-1) {
			if(num==k||(num==k-1&&cs[x][y]>max)) {
				return ways[x][y][num][max+1] = 1 ;
			}
			return ways[x][y][num][max+1] = 0 ;
		}
		if(x<m-1) {
			if(cs[x][y]>max) {
				t += f(x+1,y,num+1,cs[x][y]);
				t %= MOD ;
			}
			t += f(x+1,y,num,max);
			t %=MOD ;
		}
		if(y<n-1) {
			if(cs[x][y]>max) {
				t += f(x,y+1,num+1,cs[x][y]);
				t %= MOD ;
			}
			t += f(x,y+1,num,max);
			t%=MOD ;
		}
		ways[x][y][num][max+1] = t ;
		return ways[x][y][num][max+1] ;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt() ;
		m = scan.nextInt() ;
		k = scan.nextInt() ;
		cs = new int[m][n];
		for(int i = 0 ; i < n ;i++) {
			for(int j = 0 ; j < m ;j++) {
				cs[j][i] = scan.nextInt();
			}
		}
		scan.close(); 
		ways = new int[51][51][13][14];
		for(int i = 0;i<51;i++) {
			for(int j = 0 ; j < 51;j++) {
				for(int q = 0 ; q < 13;q++) {
					for(int p = 0 ; p < 14;p++) {
						ways[i][j][q][p] = -1 ;
					}
				}
			}
		}
		ways[0][0][0][0] = f(0,0,0,-1);
		System.out.println(ways[0][0][0][0]);
	}
	}
