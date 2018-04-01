package 基础;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println(Integer.toHexString(number).toUpperCase());
		scanner.close();
	}

}
