package 基础;

public class Main12 {
	public static void main(String[] args) {
		for(int i = 0 ; i < 32 ; i++) {
			String temp = Integer.toBinaryString(i);
			for(int j =temp.length();j<5;j++) {
				temp = '0'+temp;
			}
			System.out.println(temp);
		}
	}

}
