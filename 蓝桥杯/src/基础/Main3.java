package 基础;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		long sum = 0 ;
		for(int i = number.length()-1 ; i >=0;i--) {
			char temp = number.charAt(number.length()-1-i);
			sum+=(Integer.parseInt(String.valueOf(temp),16)*Math.pow(16, i));
		}
		System.out.println(sum);
		
		scanner.close();
	}

}
