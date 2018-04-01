package 算法训练;

import java.util.HashSet;
import java.util.Set;

public class Permutation {
	public static boolean repetition(int number) {
		String temp = String.valueOf(number);
		for(int i = 0 ; i < temp.length()-1 ;i++) {
			if(temp.charAt(i)==temp.charAt(i+1)|| temp.charAt(i)=='0'||temp.charAt(i+1)=='0') {
				return false ;
			}
		}
		return true ;
	}
	public static boolean conform(int i, int j ,int k) {
		if(!repetition(i)||!repetition(k)||!repetition(j)) {
			return false;
		}
		Set<Character> set = new HashSet<Character>();
		String[] strings = {String.valueOf(i),String.valueOf(j),String.valueOf(k)};
		for(String string : strings) {
			for(char c : string.toCharArray()) {
				set.add(c);
			}
		}
		if(set.size() == 9) {
			return true ;
		}
		return false ;
	}
	public static void main(String[] args) {
		for(int i = 123 ; i < 330 ; i++) {
			if(!repetition(i)) {
				continue;
			}
			if(conform(i, i*2, i*3)) {
				System.out.println(i+" "+i*2+" "+i*3);
			}
		}
	}
}

