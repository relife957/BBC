package leetcode;

import java.util.Arrays;

public class Main7 {
	 public int[] searchRange(int[] nums, int target) {
		 int mid = Arrays.binarySearch(nums, target);
		 if(mid<0) {
			 int[] result = {-1,-1};
			 return result ;
		 }
		 int left = mid ,right = mid ;
		 int flag_left = -1 ;
		 int flag_right = -1 ;
		 while((left>=0&&right<nums.length)&&(nums[left]==target||nums[right]==target)) {
			 if(nums[left]==target) {
				 left--;
				 flag_left++ ;
			 }
			 if(nums[right] == target ) {
				 right++ ;
				 flag_right++ ;
			 }
		 }
		 int[] res = {(flag_left>0?left+1:left),(flag_right>0?right-1:right)};
		 return res ;
	 }
	 public static void main(String[] args) {
		int[] array = {};
		System.out.println(Arrays.binarySearch(array, 3));
	}
}
