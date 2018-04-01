package 算法训练;

public class Main25 {
	public static void f(int[] data,int[] array ,int k ) {
		if(k == 4) {
			for(int i = 0 ; i < array.length ; i++) {
				System.out.print(array[i]);
			}
			System.out.println();
			return ;
		}
		for(int i = 0 ; i <= data[k] ;i++) {
			
				if(array[i]==0 && array[i+5-k]==0) {
					array[i] = 4-k ;
					array[i+5-k] = 4-k ;
					f(data, array, k+1);
					array[i] = 0 ;
					array[i+5-k] = 0 ;
				}
			
		}
	}
	public static void main(String[] args) {
		int[] data = {2,3,4,5};
		int[] array = new int[8];
		f(data, array, 0);
	}
}
