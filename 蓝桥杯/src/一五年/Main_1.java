package 一五年;

public class Main_1 {
	public static void main(String[] args) {
		int count = 0 ; 
		int sum = 1543 ;
		while(sum >0) {
			if(sum%2!=0) {
				count++; 
			}
			sum = sum/2 ;
		}
		System.out.println(count);
	}
}
