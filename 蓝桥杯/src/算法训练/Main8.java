package 算法训练;

public class Main8 {
	 public boolean isPalindrome(int x) {
		 long x1 = Long.parseLong(String.valueOf(x));
        if(x1<0){
            return false ;
        }
        String num = String.valueOf(x);
        if(num.length()<2) {
        	return true ;
        }
        int begin = 0 ;
        int end = 0 ;
        if(num.length()%2 == 1) {
        	begin = num.length()/2 ;
        	end = begin ;
        	while(begin>=0 && end<num.length() && num.charAt(begin)==num.charAt(end)) {
        		begin-- ;
        		end++ ;
        	}
        }else {
        	end = num.length()/2 ;
        	begin = end - 1 ;
        	while(begin>=0 && end<num.length() && num.charAt(begin)==num.charAt(end)) {
        		begin-- ;
        		end++ ;
        	}
        }
        if(begin<0) {
        	return true ;
        }else {
        	return false ;
        }
	    }
	 public static void main(String[] args) {
	
	}
}
