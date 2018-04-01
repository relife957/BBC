package 算法训练;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main16 {
	public List<List<Integer>> fourSum(int[] nums, int target) {
       Arrays.sort(nums);
       List<List<Integer>> result = new ArrayList<>() ;
       for(int i = 0 ; i < nums.length-3 ;i++) {
    	   if(i == 0 || nums[i] != nums[i-1]) {
	    	   for(int j = i+1 ; j<nums.length-2 ;j++) {
	    		   int begin = j+1 ;
		    	   int end = nums.length-1 ;
		    	   int sum = target - nums[i]-nums[j] ;
		    	   while(begin<end) {
		    		   if(nums[begin]+nums[end]==sum) {
		    			   List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[begin],nums[end]);
		    			   if(!result.contains(temp)) {
		    				   result.add(temp);
		    			   }
		    			   while(begin<end&&nums[begin]==nums[begin+1]) {
		    				   begin++ ;
		    			   }
		    			   while(begin<end&&nums[end]==nums[end-1]) {
		    				   end-- ;
		    			   }
		    			   begin++;
		    			   end-- ;
		    		   }else if(nums[begin]+nums[end]<sum) {
		    			   begin++ ;
		    		   }else {
		    			   end-- ;
		    		   }
		    	   }
	    	   }
    	   }
       }
       return result ;
    }
}
