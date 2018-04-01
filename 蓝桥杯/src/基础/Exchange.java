package 基础;

import java.util.Scanner;

public class Exchange {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt() ;
		String[] sixteen = new String[n];
		for(int i = 0 ; i < n ;i++) {
			StringBuilder builder = new StringBuilder();
			String temp = scanner.next();
			for(int j = 0 ; j < temp.length() ; j++) {
				char m = temp.charAt(j);
				String b = Integer.toBinaryString(Integer.valueOf(String.valueOf(m),16));
				for(int k = b.length() ; k < 4 ; k++) {
					b = '0' + b ;
				}
				builder.append(b);
			}
			
			StringBuilder builder2 = new StringBuilder();
			int zero = 3 - (builder.length()%3) ;
			for(int j = 0 ; j < zero ; j++) {
				builder = new StringBuilder("0").append(builder);
			}
			for(int k = 0 ; k <= builder.length()-3;k+=3) {
				String temp0 = builder.substring(k,k+3);
				String eight = Integer.toOctalString(Integer.valueOf(String.valueOf(temp0),2));
				builder2.append(eight);
			}
			
			sixteen[i] = builder2.toString().replaceAll("^(0+)","");
			
			
		}
		for(String temp : sixteen) {
			System.out.println(temp);
		}
		scanner.close();
	}
}
