package 历届试题;

import java.math.BigInteger;
import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		BigInteger n = scan.nextBigInteger() ;
//		BigInteger m = scan.nextBigInteger() ;
//		BigInteger p = scan.nextBigInteger() ;
//		scan.close() ;
//		BigInteger[] nums = new BigInteger[3] ;
//		nums[0] = BigInteger.ONE ;
//		nums[1] = BigInteger.ONE ;
//		BigInteger max = n.max(m) ;
//		BigInteger mod_m = BigInteger.ONE ;
//		BigInteger sum_n = BigInteger.ONE ;
//		for(BigInteger i = BigInteger.valueOf(3) ; i.max(max).equals(max);i = i.add(BigInteger.ONE)) {
//			nums[2] = nums[0].add(nums[1]) ;
//			nums[0] = nums[1] ;
//			nums[1] = nums[2] ;
//			if(i.equals(m)) {
//				mod_m = nums[2] ;
//			}
//			if(i.equals(n)) {
//				sum_n = nums[2] ;
//			}
//		}
//		
//		System.out.println(sum_n.mod(mod_m).mod(p));
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long m = scan.nextLong();
		long p = scan.nextLong();
		long[] nums = new long[3] ;
		nums[0] = 1 ;
		nums[1] = 1 ;
		long sum = 0 ;
		if(n>m) {
			long mod = Long.MAX_VALUE ;
			for(long i = 2 ; i < n+2 ;i++) {
				nums[2] = ((nums[0]+nums[1])%mod)%p ;
				nums[0] = nums[1] ;
				nums[1] = nums[2] ;
				if(i==m-1) {
					mod = nums[2] ;
				}
			}
			if(n<3) {
				sum = 1 ;
			}else {
				sum = nums[2]%mod ;
			}
		}else {
			long num = 0 ;
			for(int i =2 ; i<m;i++) {
				nums[2] = (nums[0]+nums[1])%p ;
				nums[1] = nums[0] ;
				nums[0] = nums[1] ;
				if(i==n-1) {
					num = nums[2] ;
				}
			}
			sum = num%nums[2] ;
		}
		scan.close();
		System.out.println(sum%p);
	}
}
