package 试验;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Exercise2 {
	public static BigInteger myBigNumSqrt(BigInteger xx)
	{
		BigDecimal x=new BigDecimal(xx);
		BigDecimal n1=BigDecimal.ONE;
		BigDecimal ans=BigDecimal.ZERO;
		//int i=1;
		while((n1.multiply(n1).subtract(x)).abs().compareTo(BigDecimal.valueOf(0.001))==1)
		{
			//System.out.println(i+"..."+n1);
			//i++;
			BigDecimal s1=x.divide(n1,2000,BigDecimal.ROUND_HALF_UP);
			BigDecimal s2=n1.add(s1);
			n1=s2.divide(BigDecimal.valueOf(2),2000,BigDecimal.ROUND_HALF_UP);
			System.out.println(n1);
		}
		ans=n1;
		//System.out.println(ans);
		BigInteger rt =new BigInteger(ans.toString().split("\\.")[0]);
		return rt;
	}
	public static void main(String[] args) {
		BigInteger xx = new BigInteger("10000");
		System.out.println(myBigNumSqrt(xx));
	}

}
