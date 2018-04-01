package 算法训练;

public class Main10 {
	public static int getV(int[] height , int begin ,int end){
		return (int)(Math.PI*(end-begin)*(end-begin)*Math.min(height[begin], height[end])) ;
	}
	public int maxArea(int[] height) {
		int begin = 0 ;
		int end = height.length-1 ;
		int max = 0 ;
		while(begin<end) {
			max = Math.max(max, getV(height, begin, end));
			if(height[begin]>=height[end]) {
				begin++;
			}else {
				end-- ;
			}
		}
		return max ;
	}
}
