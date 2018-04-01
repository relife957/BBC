package 历届试题;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main3 {
	public static boolean judge(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int i :nums) {
			set.add(i);
		}
		return set.size()==1;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int peo_num = scanner.nextInt();
		int[] nums = new int[peo_num];
		for(int i = 0 ; i < peo_num;i++) {
			nums[i] = scanner.nextInt();
		}
		scanner.close();
		int res = 0 ;
		while(!judge(nums)) {
			int temp = nums[peo_num-1]/2 ,temp2 = 0 ;
			for (int i = nums.length-2; i >=0; i--) {
				temp2 = nums[i]/2 ;
				nums[i] = temp2+temp ;
				temp = temp2 ;
				if(nums[i]%2==1) {
					res++;
					nums[i]++;
				}
			}
			nums[peo_num-1] = nums[peo_num-1]/2+temp ;
			if(nums[peo_num-1]%2==1) {
				res++ ;
				nums[peo_num-1]++ ;
			}
		}
		System.out.println(res);
	}
}
