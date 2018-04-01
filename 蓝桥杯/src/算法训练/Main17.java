package 算法训练;

import java.util.ArrayList;
import java.util.List;

public class Main17 {
	public List<String> letterCombinations(String digits) {
        String[] phone= {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> first = new ArrayList<>();
        if(digits.length()<1) {
        	return  first ;
        }
        int index = (digits.charAt(0)-'0')-2;
        for(int i = 0 ; i < phone[index].length() ;i++) {
        	first.add(phone[index].charAt(i)+"");
        }
        if(digits.length()==1) {
        	return first ;
        }
        for(int i = 1; i < digits.length() ;i++) {
        	int temp_index = (digits.charAt(i)-'0')-2 ;
        	first = link(first, phone[temp_index]);
        }
        return first ;
    }
	public static List<String> link(List<String> pre ,String last ) {
		List<String> result = new ArrayList<>();
		for(int j = 0 ; j < pre.size() ;j++) {
			for(int i = 0 ; i < last.length() ;i++) {
				result.add(pre.get(j)+last.charAt(i));
			}
		}
		return result ;
	}
	public static void main(String[] args) {
		String string = "123" ;
		int s = string.charAt(0)-'0';
		System.out.println(string.isEmpty());
		
	}
}
