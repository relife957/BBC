package 算法训练;

import java.util.Arrays;

public class Main15 {
	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int closest = 0 ;
		int flag = Integer.MAX_VALUE ;
		for(int i = 0 ; i < nums.length-2 ; i++) {
			if(i==0||nums[i]!=nums[i-1]) {
				int begin = i+1 ;
				int end = nums.length-1 ;
				while(begin<end) {
					System.out.println(nums[i]+" " + nums[begin]+" "+nums[end]);
					int temp = nums[begin]+nums[end]+nums[i]-target ;
					if(flag>Math.abs(temp)) {
						closest = temp ;
						flag = Math.abs(temp);
					}
					while(begin<end && nums[begin]==nums[begin+1]) {
						begin++ ;
					}
					while(begin<end && nums[end]==nums[end-1]) {
						end-- ;
					}
					if(temp>0) {
						end-- ;
					}else if(temp < 0) {
						begin++;
					}else {
						return target ;
					}
					System.out.println(begin+" "+end);
				}
			}
		}
		return closest+target ;
    }
	public static void main(String[] args) {
		int[] array = {-1,0,1,1,55} ;
		int target = 3 ;
		System.out.println(threeSumClosest(array, target));
	}
}
