package 基础;

import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int [n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();
		int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE,sum = 0  ;
		for (int i : array) {
			min = Math.min(i, min);
			max = Math.max(max, i);
			sum+=i ;
		}
		System.out.println(max + "\n" + min + "\n" + sum);
	}

}
