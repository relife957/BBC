package 基础;

import java.util.Scanner;

public class Main9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		int seek_number = scanner.nextInt();
		scanner.close();
		int seek_index = -1 ;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == seek_number) {
				seek_index = i+1 ;
				break ;
			}
		}
		System.out.println(seek_index);
	}

}
