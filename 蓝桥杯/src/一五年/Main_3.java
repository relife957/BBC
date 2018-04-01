package 一五年;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main_3 {
	public static boolean judge(int i) {
		Set<Character> set = new HashSet<>();
		for(int j = 1 ; j < 4 ;j++) {
			char[] temp = (i*j+"").toCharArray();
			for(char c:temp) {
				if(c == '0') {
					return false ;
				}
				set.add(c);
			}
		}
		return set.size()==9;
	}
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		for(int i = 123 ; i <333 ;i++) {
			if(judge(i)) {
				System.out.println(i);
			}
		}
	}
}
