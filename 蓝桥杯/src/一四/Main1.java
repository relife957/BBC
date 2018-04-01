package 一四;

public class Main1 {
	public static void main(String[] args) {
		for(int i = 1 ; i < 100 ;i++) {
			for(int j = i;j<i+8;j++) {
				if(i*j==(i+j)*6) {
					System.out.println(i+" "+j);
					break;
				}
			}
		}
	}
}
