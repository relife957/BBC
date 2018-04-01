package 算法训练;

import java.util.Stack;

public class Main19 {
	public static boolean ismatch(char left,char right) {
		if((left == '(' && right == ')') || (left == '[' && right == ']') || (left == '{' && right == '}')) {
			return true ;
		}
		return false ;
	}
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0 ; i <s.length() ; i++) {
			if(stack.isEmpty()) {
				stack.push(s.charAt(i));
			}else if(ismatch(stack.peek(),s.charAt(i))) {
				stack.pop();
			}else {
				stack.push(s.charAt(i));
			}
		}
		return stack.isEmpty() ;
    }
}
