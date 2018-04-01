package 历届试题;

import java.util.Scanner;

public class Main4 {
	public static int cul(int base,int num) {
		int temp = base ;
		for(int i = 0 ; i < num ; i++) {
			temp += temp+1 ;
		}
		return temp ;
	}
	public static int[] unHappiness(int[] nums ,int begin ,int end) {
		for(int i = begin ; i <= end ; i++) {
			if(i == begin) {
				nums[begin] = cul(nums[end],end-begin);
			}else {
				nums[i] = nums[i-1]*2+1;
			}
		}
		return nums ;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int len = scanner.nextInt();
		int[] nums = new int[len];
		for(int i = 0 ; i < len ; i++) {
			nums[i] = scanner.nextInt();
		}
		scanner.close();
		int[] flags = new int[len];
		for(int i = 0 ;i<len-1 ;i++) {
			int min = i ;
			for(int j = i+1 ;j<len ;j++) {
				if(nums[j]<nums[min]) {
					min = j ;
				}
			}
			if(min!=i) {
				int temp = nums[min];
				nums[min] = nums[i];
				nums[i] = temp ;
				flags = unHappiness(flags, i, min);
			}
		}
		int sum = 0 ;
		for(int num:flags) {
			sum+=num ;
		}
		System.out.println(sum);
		
	}
}
