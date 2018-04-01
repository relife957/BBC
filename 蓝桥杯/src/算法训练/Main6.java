package 算法训练;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main6 {
	 public static String convert(String s, int numRows) {
		 if(s.length()<2 || numRows == 1) {
			 return s ;
		 }
		 Map<String, Integer> map = new LinkedHashMap<>();
		 String result = "";
		 int increment = 1;
		 boolean flag = true ;//false代表减,true代表增;
		 int count = 1 ;
		 for(int i = 0 ; i < s.length() ; i++) {
			 if(map.containsKey(String.valueOf(s.charAt(i)))) {
				 map.put(String.valueOf(s.charAt(i))+count, increment);
				 count++ ;
			 }else {
				 map.put(String.valueOf(s.charAt(i)), increment);
			 }
			 if(increment == 1) {
				 flag = true ;
			 }
			 if(increment == numRows) {
				 flag = false ;
			 }
			 if(flag) {
				 increment++ ;
			 }else {
				 increment--;
			 }
		 }
		 for(int i = 1 ; i <= numRows ; i++) {
			 result += print(map, i) ;
		 }
		 return result ;
	 }
	 public static String print(Map<String, Integer> map,int num) {
		 String result = "" ;
		 for(Entry<String, Integer> element : map.entrySet()) {
			 if(element.getValue() == num ) {
				 if(element.getKey().length()!=1) {
					 result += element.getKey().substring(0,1);
					 continue;
				 }
				 result += element.getKey() ;
			 }
		 }
		 return result ;
	 }
	
	
	
	public static void main(String[] args) {
		String text = "PAYPALISHIRING" ;
		//System.out.println(convert(text, 3));
		System.out.println("".length());
		//PAHNAPLSIIGYIR
	}
	
}
