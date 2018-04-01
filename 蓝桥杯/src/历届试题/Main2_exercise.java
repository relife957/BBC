package 历届试题;

import java.util.Arrays;
import java.util.Scanner;

public class Main2_exercise {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		int s = scan.nextInt();
		scan.nextLine();
		String[] ss = new String[s];
		for(int i = 0 ;i<s;i++) {
			ss[i] = scan.nextLine();
		}
		for(String sss:ss) {
			System.out.println(sss);
		}
		scan.close(); 
	}
}
