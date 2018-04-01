package 历届试题;

import java.util.Scanner;

public class Main4_4 {
	public static int lowbit(int num) {
		return num&(-num); 
	}
	public static void add(int pos,int val ,int[] nums) {
//		if(pos<1||pos>nums.length) {
//			System.out.println("error");
//			return ;
//		}
		while(pos<nums.length) {
			nums[pos]+=val;
			pos+=lowbit(pos);
		}
	}
	public static int getsum(int[] nums,int pos) {
//		if(pos<1||pos>nums.length) {
//			System.out.println("error");
//			return 0;
//		}
		int sum = 0;
		while(pos>0) {
			sum+=nums[pos];
			pos-=lowbit(pos);
		}
		return sum ;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = 100002 ;
		int len = scanner.nextInt();
		int[] nums = new int[N];
		for(int i = 0 ; i < len ; i++) {
			nums[i] = scanner.nextInt();
		}
		scanner.close();
		int maxh = 1000010 ;
		int[] c1 = new int[maxh];
		int[] c2 = new int[maxh];
		int[] col = new int[N];
		for(int i = 0 ; i < len ; i++) {
			add(nums[i]+1,1,c1);
			col[i] = i-getsum(c1,nums[i]);
			col[i] -= (getsum(c1,nums[i]+1)-getsum(c1,nums[i])-1);
		}
		for(int i = len-1 ; i > -1 ; i--) {
			add(nums[i]+1,1,c2);
			col[i] += getsum(c2,nums[i]);
		}
		int ans = 0 ;
		for(int i : col	) {
			ans+=i*(i+1)/2 ;
		}
		System.out.println(ans);
	}
}
