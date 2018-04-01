package 一五年;

public class Main_7 {
	static int f(int[] s ,int k ,int count) {
		if(count==13) {
			return 1 ;
		}
		if(k == 14) {
			return 0 ;
		}
		if(s[k]==0) {
			return f(s,k+1,count);
		}
		int sum = 0 ;
		s[k]-- ;
		sum+=f(s,k,count+1);
		s[k]++ ;
		sum+=f(s,k+1,count);
		return sum ;
	}
	public static void main(String[] args) {
		int[] s = new int[14];
		for(int i = 1 ; i< 14 ;i++) {
			s[i] = 4 ;
		}
		System.out.println(f(s,1,0));
		
	}
}
