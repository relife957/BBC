package 试验;

public class Stringbuilderdemo {
	public static void main(String[] args) {
		StringBuilder buff = new StringBuilder() ;
		StringBuffer buffer = new StringBuffer() ;
		char[] cs = "123456789".toCharArray();
		for(int i = 0; i < 9 ; i++) {
			buff.append(cs[i]);
			buffer.append(cs[i]);
		}
		System.out.println(Integer.parseInt(buff.toString()));
		System.out.println(Integer.parseInt(buffer.toString()));
	}
}
