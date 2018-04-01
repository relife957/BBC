package 试验;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Three {
	public static void main(String[] args) {
		//保留小数
		double d = 30;
		BigInteger bigInteger = new BigInteger("65536");
		BigInteger b2 = bigInteger.pow(2);
		BigDecimal bigDecimal = new BigDecimal(b2);
		double d2 = bigDecimal.divide(BigDecimal.valueOf(180),10, BigDecimal.ROUND_HALF_UP).doubleValue();

		//三角函数
		//System.out.println(d2);
		System.out.println(Math.sin(0.5*Math.PI));
		//System.out.println(BigDecimal.valueOf(1).divide(bigDecimal, 5, BigDecimal.ROUND_HALF_UP));
	}
}
