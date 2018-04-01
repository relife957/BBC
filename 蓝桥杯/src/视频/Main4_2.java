package 视频;

public class Main4_2 {
	public static void f(int[] a,int k ,int sum ,String str) {
		if(sum == 0) {
			System.out.println(str) ;
			return ;
		}
		if(k==a.length) {
			return ;
		}
		String flag = "";
		for(int i=-1 ; i < 2 ;i++) {
			if((i == 1 || i==0) && k!=0) {
				flag = "+" ;
			}
			f(a,k+1,sum-(i*a[k]),str+flag+i*a[k]);
		}
		
	}
	public static void main(String[] args) {
		int[] a = {1,3,9,27,81};
		f(a,0,15,"");
	}
}
