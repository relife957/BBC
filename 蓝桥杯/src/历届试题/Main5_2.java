package 历届试题;

import java.util.Scanner;

public class Main5_2 {
	static final int MOD = 100000007 ;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt() ;
		int s = scan.nextInt() ;
		int a = scan.nextInt() ;
		int b = scan.nextInt() ;
		scan.close();
		int[][] dp = new int[2][1010*1010];
		int e = 0 ;
		e =DP(dp,n,e);
		int count = 0 ;
		int t = 0 ;
		for(int i = 0 ; i <= n*(n-1)/2 ;i++) {
			t = s - i*a + (n*(n-1)/2-i)*b ;
			if(t%n == 0) {
				count = (dp[e][i]+count)%MOD ;
			}
		}
		System.out.println(count);
	}

	private static int DP(int[][] dp, int n,int e) {
		// TODO Auto-generated method stub
		dp[e][0] = 1 ;
		for(int i = 1;i < n ; i++) {
			e = 1 - e ;
			for(int j = 0 ; j <= (i*(i+1))/2 ;j++) {
				if(i>j) {
					dp[e][j] = dp[1-e][j] ;
				}else {
					dp[e][j] = (dp[1-e][j-i] + dp[1-e][j])%MOD;
				}
			}
		}
		return e ;
		
	}
}
