package 一五年;

public class Main_6 {
	public static void main(String[] args) {
		for(int i =12 ; i <50 ;i++) {
			for(int j = i+2 ; j<50 ;j++) {
				int s = 1225-(i*2-1) - (j*2-1) ;
				int a = i*(i-1) + j*(j-1) ;
				if(s+a == 2015) {
					System.out.println(i-1);
				}
			}
		}
	}
}
