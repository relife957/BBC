package 历届试题;

import java.util.Scanner;

public class Main5 {
	static int f(int begin,int add,int reduce,int sum_all,int sum ,int count) {
		if(count==1) {
			return sum == sum_all ? 1:0 ;
		}
		return f(begin+add,add,reduce,sum_all,sum+begin+add,count-1)+
				f(begin-reduce,add,reduce,sum_all,sum+begin-reduce,count-1);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt() ;
		int s = scan.nextInt() ;
		int a = scan.nextInt() ;
		int b = scan.nextInt() ;
		scan.close();
		int Y = 100000007 ;
		int begin = s/n - ((n-1)*a)/2 ;
		int end = s/n-((n-1)*(-b))/2+1 ;
		int ans = 0 ;
		for(int i = begin ; i < end+1 ;i++) {
			ans += f(i,a,b,s,i,n);
		}
		System.out.println(ans%Y);
	}
}
