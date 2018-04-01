package 基础;

public class Budingfangchengjie {
	public static int e_gcd(int a,int b,int[] xy) {
		if(b==0) {
			xy[0] = 1 ;
			xy[1] = 0 ;
			return a ;
		}
		int ans = e_gcd(b,a%b,xy);
		int t = xy[0] ;
		xy[0] = xy[1] ;
		xy[1] = t-a/b*xy[0] ;
		return ans ;
	}
	public static void main(String[] args) {
		int[] xy = new int[2] ;
		int a = e_gcd(97,127,xy);
		System.out.println(a);
		System.out.println(xy[0]+" "+xy[1]);
		System.out.println(97*xy[0]+127*xy[1]);
	}
}
