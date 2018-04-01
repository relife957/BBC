package 入门;

import java.util.Scanner;

public class Fibonacci {
	static final int NUMBER = 10007 ;
	static int f(int n ) {
		if(n == 1 || n == 2) {
			return 1 ;
		}
		int[] fa = new int[n];
		fa[0] = 1 ;
		fa[1] = 1 ;
		for(int i = 2 ; i < n ; i++) {
			fa[i] = (fa[i-1] + fa[i-2])%NUMBER ;
		}
		return fa[n-1] ;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(f(n));
		scanner.close();
	}
}
