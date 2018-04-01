package 算法训练;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main14 {
	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		for(int i = 0 ; i < nums.length-2 ; i++) {
			if(i==0 || (i>0&&nums[i]!=nums[i-1])){
				int begin = i+1 ;
				int end = nums.length-1 ;
				int sum = 0-nums[i] ;
				while(begin<end) {
					if(nums[begin]+nums[end] == sum) {
						result.add(Arrays.asList(nums[i],nums[begin],nums[end]));
						while(begin<end && nums[begin]==nums[begin+1]) {
							begin++ ;
						}
						while(begin<end && nums[end] == nums[end-1]) {
							end-- ;
						}
						begin++;
						end-- ;
					}else if(nums[begin]+nums[end] < sum) {
						begin++ ;
					}else {
						end-- ;
					}
				}
			}
		}
		return result ;
	}
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6} ;
		System.out.println(threeSum(array));
	}
}
