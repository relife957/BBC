package 试验;

public class TimeCastCompare {
	public static int gradual(int n) {
		return n-1 ;
	}
	public static int half(int n) {
		int count = 0 ;
		int half = n ;
		while(half>0) {
			half = half/2 ;
			count += half;
		}
		return count ;
	}
	public static void main(String[] args) {
		for(int i = 10000 ; i<10020 ;i++) {
			System.out.println(gradual(i)+" " + half(i));
		}
	}
}
