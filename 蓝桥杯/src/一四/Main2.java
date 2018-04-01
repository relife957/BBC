package 一四;

public class Main2 {
	public static int f(int sum ,int a,int b) {
		if(a==0&&b==1&&sum==1) {
			return 1 ;
		}
		if(a>0&&b>1) {
			return f(sum*2,a-1,b)+f(sum-1,a,b-1);
		}else if(a>0) {
			return f(sum*2,a-1,b);
		}else if(b>1) {
			return f(sum-1,a,b-1);
		}
		return 0;
	}
	public static void main(String[] args) {
		System.out.println(f(2,5,10));
	}
}
