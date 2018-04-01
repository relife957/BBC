package 历届试题;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main1 {
	public static BigInteger bigNumberSqrt(BigInteger num) {
		BigDecimal x = new BigDecimal(num);
		BigDecimal n = BigDecimal.ONE ;
		while(n.multiply(n).subtract(x).abs().compareTo(BigDecimal.valueOf(0.001))==1){
			BigDecimal t1 = x.divide(n,2000,BigDecimal.ROUND_HALF_UP);
			BigDecimal t2 = n.add(t1);
			n = t2.divide(BigDecimal.valueOf(2),2000,BigDecimal.ROUND_HALF_UP);
		}
		BigInteger res = new BigInteger(n.toString().split("\\.")[0]) ;
		return res ;
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger n = scanner.nextBigInteger();
		BigInteger m = scanner.nextBigInteger();
		scanner.close();
		//0代表正面,1代表反面
		System.out.println(bigNumberSqrt(n).multiply(bigNumberSqrt(m)));
	}
}
