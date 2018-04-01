package 入门;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt() ;
		double area = Math.PI*r*r ;
		System.out.println(new java.text.DecimalFormat("#.0000000").format(area));
		scanner.close();
		

	}
	

}
