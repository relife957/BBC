package 算法训练;

import java.util.HashMap;
import java.util.Map;

public class Main13 {
	 public static int romanToInt(String s) {
		 Map<Character, Integer> map = new HashMap<>();
		 char[] symbol = {'M','D','C','L','X','V','I'};
		 int[] value = {1000,500,100,50,10,5,1};
		 for(int i = 0 ; i <symbol.length ; i++) {
			 map.put(symbol[i], value[i]);
		 }
		 int result = 0 ;
		 for(int i = 0 ; i < s.length(); i++) {
			 //System.out.println(s.charAt(i)+" "+result);
			 System.out.println(map.get(s.charAt(i)));
			  if(i!=s.length()-1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
				  result+= (map.get(s.charAt(i+1))-map.get(s.charAt(i)));
				  i++;
				  continue;
			  }
			  result += map.get(s.charAt(i)) ;
		 }
		 return result ;
	 }
	 public static void main(String[] args) {
		
	}
	 
}
