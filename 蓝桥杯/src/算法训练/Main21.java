package 算法训练;

import java.util.ArrayList;
import java.util.List;

public class Main21 {
	
	public static List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<>();
		open_close(list,new StringBuilder(),0,0,n);
		return list ;
    }

	private static void open_close(List<String> list, StringBuilder sb, int open, int close, int max) {
		// TODO Auto-generated method stub
		if(sb.length()==max*2) {
			list.add(sb.toString());
			return ;
		}
		if(open<max) {
			sb.append('(');
			open_close(list, sb, open+1, close, max);
			sb.setLength(sb.length()-1);
		}
		if(close<open) {
			sb.append(')');
			open_close(list, sb, open, close+1, max);
			sb.setLength(sb.length()-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(generateParenthesis(3).get(2));
	}
}
