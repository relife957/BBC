package 历届试题;

import java.math.BigInteger;

public class BigNumber {
	public static int[] change(String s) {
		int[] array = new int[s.length()];
		for(int i = 0 ; i < s.length() ; i++) {
			array[i] = s.charAt(s.length()-1-i)-'0';
		}
		return array ;
	}
	public static BigInteger mutiple(String s1 , String s2) {
		int[] a1 = change(s1);
		int[] a2 = change(s2);
		int[] result = new int[a1.length+a2.length];
		for(int i = 0 ; i < a1.length ;i++) {
			for(int j = 0 ; j < a2.length ;j++) {
				result[i+j] += a1[i]*a2[j] ;
			}
		}
		for(int i = 0 ; i < result.length ; i++) {
			if(result[i] > 10) {
				result[i+1]+=result[i]/10 ;
				result[i] = result[i]%10 ;
			}
		}
		StringBuilder sum = new StringBuilder();
		for(int i = result.length-1 ; i>=0 ;i-- ) {
			sum.append(result[i]);
		}
		String temp = sum.toString();
		for(int i = 0 ; i < temp.length();i++) {
			if(temp.charAt(0)=='0') {
				temp = temp.substring(1);
			}else {
				break ;
			}
		}
		BigInteger bigInteger = new BigInteger(temp);
		return bigInteger ;
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(mutiple("123456", "123456"));
	}

}
