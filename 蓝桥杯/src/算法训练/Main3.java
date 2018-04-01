package 算法训练;

import java.util.HashMap;
import java.util.Map;

public class Main3 {
   
    public static int lengthOfLongestSubstring(String s) {
        int max = 0 ;
    	Map<Character, Integer> map = new HashMap<>();
        for(int i = 0,j=0 ;i < s.length() ;i++) {
        	if(map.containsKey(s.charAt(i))) {
        		j = Math.max(j, map.get(s.charAt(i))+1);
        	}
        	map.put(s.charAt(i),i);
        	max = Math.max(max, i-j+1) ;
        }
        return max ;
        
    }
    public static void main(String[] args) {
		String string = "abcabcbb" ;
		System.out.println(lengthOfLongestSubstring(string));
		//System.out.println(isSame(string.substring(0, 2)));
		//System.out.println(string.substring(3,4));
    }
}