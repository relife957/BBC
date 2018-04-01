package leetcode;

public class Main4 {
	public static void swap(int[] nums ,int begin , int end) {
		while(begin<end) {
			int temp = nums[begin];
			nums[begin] = nums[end];
			nums[end] = temp ;
			begin++ ;
			end-- ;
		}
	}
	public void nextPermutation(int[] nums) {
		
		int flag = -1 ;
		for(int i = nums.length-1 ;i>0 ;i--) {
			if(nums[i]>nums[i-1]) {
				flag = i-1 ;
				break ;
			}
		}
		
		if(flag<0) {
			swap(nums, 0, nums.length);
			return ;
		}
		
		for(int i = nums.length-1 ; i>flag ; i--) {
			if(nums[i]>nums[flag]) {
				int temp = nums[flag] ;
				nums[flag] = nums[i] ;
				nums[i] = temp ;
				break ;
			}
		}
		
		swap(nums, flag+1, nums.length-1);
    }
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5} ;
		swap(array, 0, 4);
		System.out.println(array[1]);
	}
}
