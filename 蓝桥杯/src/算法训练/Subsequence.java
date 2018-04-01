package 算法训练;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Subsequence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()) {
			int first = scanner.nextInt();
			int second = scanner.nextInt();
			if(first==0&&second==0) {
				break;
			}
			double sum = 0 ;
			for(int i = first;i<=second;i++) {
				BigInteger b1 = new BigInteger(String.valueOf(i));
				BigDecimal temp = new BigDecimal(b1.pow(2));
				sum+=BigDecimal.valueOf(1).divide(temp,5,BigDecimal.ROUND_HALF_UP).doubleValue();
			}
			System.out.println(sum);
			
		}
		scanner.close();
	}
}
