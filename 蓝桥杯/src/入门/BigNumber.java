package 入门;

import java.util.Scanner;

public class BigNumber {

	static long add(long number) {
		long spare = number%2==0?0:number/2+1 ;
		return (1+number)*(number/2)+spare ;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		System.out.println(add(n));
		scanner.close();
	}
}
