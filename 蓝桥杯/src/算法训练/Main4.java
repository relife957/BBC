package 算法训练;

public class Main4 {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length) {
        	int[] temp = nums1 ;
        	nums1 = nums2 ;
        	nums2 = temp ;
        }
        int m = nums1.length ;
        int n = nums2.length ;
        int lmin = 0 ;
        int lmax = m ;
        int half_len = (m+n+1)/2 ;
        while(lmin <= lmax) {
        	int i = (lmin+lmax)/2 ;
        	int j = half_len-i ;
        	int left = 0 ;
        	int right = 0 ;
        	if(i>0 && nums1[i-1] > nums2[j]) {
        		//i大了
        		lmax = i - 1 ;
        	}else if(i < m && nums2[j-1] > nums1[i]) {
        		//i小了
        		lmin  = i + 1 ;
        	}else {
        		if(i == 0) {
        			left = nums2[j-1] ;
        		}else if(j==0) {
        			left = nums1[i-1] ;
        		}else {
        			left = Math.max(nums1[i-1], nums2[j-1]);
        		}
        		if((m+n)%2 == 1) {
        			return left ;
        		}
        		if(i==m) {
        			right = nums2[j];
        		}else if(j==n) {
        			right = nums1[i];
        		}else {
        			right = Math.min(nums1[i], nums2[j]);
        		}
        		return (left + right)/2.0 ;
        	}
        }
        return 0 ;
    }
	public static void main(String[] args) {
		int[] nums1 = {1,3};
		int[] nums2 = {2,4} ;
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
}
