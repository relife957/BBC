package 算法训练;

public class Main7 {
	public static int reverse(int x) {
		long x1 = Long.parseLong(String.valueOf(x));
        if(x1>=Integer.MAX_VALUE || x1 <= Integer.MIN_VALUE) {
        	return 0 ;
        }
        if(x1<0) {
        	int x2 = (int)Math.abs(x1) ;
        	return 0-reverse(x2);
        }
        String result = "";
        char[] cs= String.valueOf(x1).toCharArray();
        for(int i = cs.length-1 ; i >=0 ; i--) {
        	result+=cs[i];
        }
        if(Long.parseLong(result)>Integer.MAX_VALUE) {
        	return 0 ;
        }
        return Integer.parseInt(result);
       
    }
	public static void main(String[] args) {
		long s = Long.parseLong(String.valueOf(-2147483648)) ;
		//System.out.println(2147483648>Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(s<=Integer.MIN_VALUE);
	}
}
