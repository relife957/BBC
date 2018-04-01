package 算法训练;

public class Main5 {
	//判断字符串是不是回文的
//	public static boolean judge(String s) {
//		int len = s.length() ;
//		if(len == 1) {
//			return false ;
//		}
//		int mid = (len%2==1?len/2+1:len/2);
//		for(int i = 0 , j = len-1; i < mid && j >=len/2; i++,j--) {
//			if(s.charAt(i)!=s.charAt(j)) {
//				return false ;
//			}
//		}
//		return true ;
//	}
//	 public String longestPalindrome(String s) {
//	     int max = 0 ; 
//	     int begin = 0 ; 
//	     int end = 0;
//		 for(int i = 0 ; i<s.length();i++){
//			 if(s.length()-i <= max) {
//				 break ;
//			 }
//	    	 for(int j = i+1 ; j<s.length();j++) {
//	    		 if(judge(s.substring(i,j))) {
//	    			 max = j-i ;
//	    			 begin = i ;
//	    			 end = j ;
//	    		 }
//	    	 }
//	     }
//		 return s.substring(begin,end);
//	 }
	 int begin = 0 ; 
	 int maxlen = 0 ;
	 public String longestPalindrome(String s) {
		 int len = s.length();
		 if(len<2) {
			 return s ;
		 }
		 for(int i = 0 ; i < len ; i++) {
			maxlens(s, i, i); //奇数
			maxlens(s, i, i+1); //偶数
		 }
		 return s.substring(begin, begin+maxlen);
		 
	 }
	 public void maxlens(String string ,int begin1 ,int begin2) {
		 while(begin1>=0 && begin2<string.length() && string.charAt(begin1)==string.charAt(begin2)) {
			 begin1-- ;
			 begin2++ ;
		 }
		 if(maxlen <begin2-begin1+1) {
			 begin = begin1 ;
			 maxlen = begin2-begin1+1 ;
		 }
	 }
}
