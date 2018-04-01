package 基础;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for(int i = 0 ; i < n ; i++) {
			array[i] = scanner.nextInt() ;
		}
		Arrays.sort(array);
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print(array[i]+ (i==array.length-1 ? "":" ") );
		}
		scanner.close();
	}

}
