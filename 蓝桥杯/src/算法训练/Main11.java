package 算法训练;

public class Main11 {
	 public String longestCommonPrefix(String[] strs) {
		 if(strs.length == 0) {
			 return "" ;
		 }else if(strs.length == 1) {
			 return strs[0] ;
		 }
		 String result = "" ;
		 for(int i = 0 ; i<strs[0].length(); i++ ) {
			 for(int j = 1 ; j < strs.length;j++) {
				 if(strs[0].charAt(i)!=strs[j].charAt(i)) {
					 return result ;
				 }
			 }
			 result+=strs[0].charAt(i);
		 }
		 return result ;
	 }
}
