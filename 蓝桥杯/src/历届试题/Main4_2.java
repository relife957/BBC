package 历届试题;

import java.util.Scanner;

public class Main4_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int len = scanner.nextInt();
		int[] nums = new int[len];
		for(int i = 0 ; i < len ; i++) {
			nums[i] = scanner.nextInt();
		}
		scanner.close();
		int[] unhap = new int[len] ;
		boolean flag = true ;
		while(flag) {
			flag = false ;
			for(int i = 0 ; i < len-1 ; i++) {
				if(nums[i]>nums[i+1]) {
					//交换
					int temp = nums[i];
					nums[i] = nums[i+1] ;
					nums[i+1] = temp ;
					//标志改变
					flag = true ;
					int temp2 = unhap[i] ;
					unhap[i] = unhap[i+1]*2+1 ;
					unhap[i+1] = temp2*2+1 ;
 				}
			}
		}
		int sum = 0 ;
		for(int i : unhap) {
			sum += i ;
		}
		System.out.println(sum);
	}
	
}
