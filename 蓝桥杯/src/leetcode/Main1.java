package leetcode;

public class Main1 {
	public int strStr(String haystack, String needle) {
		if(needle.equals("")) {
			if(haystack.equals("")) {
				return 0 ;
			}
			return -1 ;
		}else if(needle.length()>haystack.length()) {
			return -1 ;
		}
		for(int i = 0 ; i < haystack.length() ;i++) {
			if(haystack.charAt(i) == needle.charAt(0)) {
				if(needle.length()>1) {
					int count = 1 ;
					for(int j = 1 ; j < needle.length()&&i<haystack.length() ;j++) {
						if(haystack.charAt(i+j)==needle.charAt(j)) {
							count++ ;
						}
					}
					if(count == needle.length()) {
						return i ;
					}
					continue;
				}
				return i ;
			}
		}
		return -1 ;
    }
}
