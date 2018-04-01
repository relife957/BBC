package 基础;

import java.util.Scanner;

public class Main11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();
		char[][] array = new char[m][n];
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < m ; j++) {
				array[j][i] = (char)(Math.abs(i-j)+65);
			}
		}
		for(int i = 0 ; i < n ; i++) {
			StringBuilder builder = new StringBuilder();
			for(int j = 0 ; j < m ;j++) {
				builder.append(array[j][i]);
			} 
			System.out.println(builder.toString());
			
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String[] array = new String[n];
//		StringBuilder builder = new StringBuilder();
//		for(int i = 65 ; i < 65+m ; i++) {
//			builder.append((char)i);
//		}
//		array[0] = builder.toString();
//		for(int i = 1 ; i < n ; i++) {
//			if(i>=m) {
//				array[i] = array[i-1];
//				continue;
//			}
//			 String temp = array[i-1];
//			 temp = array[0].charAt(i) + temp.substring(0, m-1);
//			 array[i] = temp ;
//		}
//		for(String string : array) {
//			System.out.println(string);
//		}