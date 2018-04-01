package 历届试题;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberSqrt {
	public static void sqrt(String s) {
		int length = s.length();
		int sqrt_length = 0 ;
		if(length%2 == 1) {
			sqrt_length = length/2+1 ;
		}else {
			sqrt_length = length/2 ;
		}
		StringBuilder builder = new StringBuilder();
		for(int j = 0 ; j < sqrt_length ;j++) {
			int i = 0 ;
			String string = builder.toString()+i;
			
				
			}
			
				
		}
	
	public static void main(String[] args) {
		BigInteger bigInteger = new BigInteger("101");
		BigDecimal bigDecimal = new BigDecimal(bigInteger);
		BigDecimal n1 = new BigDecimal(51);
		System.out.println(bigDecimal.divide(n1,2000,BigDecimal.ROUND_HALF_UP));
	}

}
