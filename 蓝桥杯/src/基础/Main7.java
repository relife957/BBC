package 基础;

public class Main7 {
	public static void main(String[] args) {
		for(int i = 100 ; i < 1000 ; i++) {
			int sum = 0 ;
			for(int j = 0 ; j < 3 ;j++) {
				sum+=Math.pow(Integer.parseInt(String.valueOf(String.valueOf(i).charAt(j))),3);
			}
			if(sum == i) {
				System.out.println(i);
			}
		}
	}

}
