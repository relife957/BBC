package 试验;

public class Recursion2 {
	
	public static void main(String[] args) {
		int[] array = new int[100];
		f(6,array,0);
	}

	private static void f(int n, int[] array, int k) {
		// TODO Auto-generated method stub
		if(n == 0) {
			for(int i = 0 ; i < k ;i++) {
				System.out.print(array[i]+(i!=k-1?"+":""));
			}
			System.out.println();
		}
		
		for(int i = n ; i > 0 ; i--) {
			if(k>0 && i>array[k-1]) {
				continue;
			}
			array[k] = i ;
			f(n-i, array, k+1);
		}
		
	}
}
