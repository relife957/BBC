package 算法训练;

public class Main9 {
	public static boolean isEquals(char s,char p) {
		if(p == '.' || s == p) {
			return true ;
		}
		return false; 
	}
	 public boolean isMatch(String s, String p) {
		 if(p.length()<s.length()) {
			 return false ;
		 }
		 int i = s.length() ; 
		 int j = p.length();
		 if(p.charAt(j)=='*') {
			 if(!isEquals(s.charAt(i), p.charAt(j-1))) {
				 return false ;
			 }
		 }else {
			 if(!isEquals(s.charAt(i), p.charAt(j))) {
				 return false ;
			 }
		 }
		 int count = 0 ;
		 while(i>=0) {
			 if(p.charAt(j)=='*' && isEquals(s.charAt(i),p.charAt(j-1))) {
				 i--;
				 j--;
				 count++ ;
				 continue;
			 }else if(p.charAt(j)=='*' && !isEquals(s.charAt(i),p.charAt(j-1))) {
				 j-=2 ;
				 continue;
			 }else if(!isEquals(s.charAt(i),p.charAt(j))){
				j--;
				continue;
			 }else if(isEquals(s.charAt(i), p.charAt(j))) {
				 count++ ;
				 i--;
				 j--;
			 }
			 if(count == s.length()) {
				 return true ;
			 }
		 }
		 return false ;
	        
    }
	 
}
