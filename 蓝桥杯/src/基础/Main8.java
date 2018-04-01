package 基础;

import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int[][] array = new int[n][n] ;
		for (int i = 0; i < array.length; i++) {
			array[0][i] = 1 ;
		}
		for(int i = 1; i < array.length;i++) {
			boolean flag = true ;
			for(int j = 1 ; j < array.length && flag ; j++) {
				array[j][i] = array[j-1][i-1] + array[j][i-1] ;
				if(array[j][i] == 0) {
					flag = false;
				}
			}
		}
		for(int i = 0 ; i < array.length;i++) {
			StringBuilder builder = new StringBuilder();
			boolean flag = true ;
			for (int j = 0; j < array.length && flag; j++) {
				if(array[j][i] != 0) {
					builder.append(array[j][i]+" ");
				}else {
					flag = false ;
				}
			}
			System.out.println(builder.substring(0,builder.length()-1));
		}
	}

}
