package 基础;

import java.util.Scanner;

public class Main13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		scanner.close();
		if(year%400 == 0  || (year%4 == 0 && year%100 != 0)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
