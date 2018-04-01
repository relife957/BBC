package leetcode;

public class Main6 {
	 public int search(int[] nums, int target) {
		if(nums[0] == target) {
			return 0 ;
		}else if(nums[nums.length-1] == target) {
			return nums.length-1 ;
		}
		int left = nums.length/2 ;
		int right = left ;
		while(left>=0||right<nums.length) {
			if(nums[left]==target) {
				return left ;
			}else if(nums[right] == target) {
				return right ;
			}
			left-- ;
			right++ ;
		}
		return -1 ;
		 
	 }
}
