package 历届试题;

import java.util.Scanner;

public class Main7 {
	static int MOD = 1000000007 ;
	public static int f(int[][] cs,int x,int y,int k ,int sum ,int max) {
		if(cs.length-x+cs[0].length-y-1<sum-k) { //如果剩余的格子数已经小于还需要拿到的宝藏数目,返回0
			return 0 ;
		}
		if(x==cs.length-1&&y==cs[0].length-1) { 
			//指到最后一个格子时如果k<sum-1或者此处的值小于max,此条路径都不成功
			if(k<sum-1||(k==sum-1&&max>=cs[x][y])) {
				return 0 ;
			}
			return 1;
		}
		if(k<sum) {
			if(cs[x][y]>max) {
				if(x==cs.length-1) {
					return (f(cs,x,y+1,k+1,sum,Math.max(max, cs[x][y]))+f(cs,x,y+1,k,sum,max))%MOD;
				}else if(y==cs[0].length-1) {
					return (f(cs,x+1,y,k+1,sum,Math.max(max, cs[x][y]))+f(cs,x+1,y,k,sum,max))%MOD;
				}
				return (f(cs,x,y+1,k+1,sum,Math.max(max, cs[x][y]))+f(cs,x,y+1,k,sum,max)+
						f(cs,x+1,y,k+1,sum,Math.max(max, cs[x][y]))+f(cs,x+1,y,k,sum,max))%MOD;
			}else {
				if(x == cs.length-1) {
					return f(cs,x,y+1,k,sum,max)%MOD;
				}else if(y==cs[0].length-1) {
					return f(cs,x+1,y,k,sum,max)%MOD;
				}
				return (f(cs,x+1,y,k,sum,max)+f(cs,x,y+1,k,sum,max))%MOD;
			}
		}else if(k==sum){
			if(y==cs[0].length-1||x==cs.length-1) {
				return 1 ;
			}
			return (f(cs,x+1,y,k,sum,max)+f(cs,x,y+1,k,sum,max))%MOD;
//			int t1 = (cs.length-x>2?cs.length-x-2:0) ;
//			int t2 = (cs[0].length-y>2?cs[0].length-y-2:0) ;
//			System.out.println(t1+" "+t2);
//			return ((t1+t2+t1*t2)*2)%MOD ;
		}
		return 0 ;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt() ;
		int m = scan.nextInt() ;
		int k = scan.nextInt() ;
		int[][] cs = new int[m][n];
		for(int i = 0 ; i < n ;i++) {
			for(int j = 0 ; j < m ;j++) {
				cs[j][i] = scan.nextInt();
			}
		}
		scan.close(); 
		System.out.println(f(cs,0,0,0,k,-1));
	}
	
}
