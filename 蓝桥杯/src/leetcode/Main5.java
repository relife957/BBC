package leetcode;

import java.util.Stack;

public class Main5 {
	 public int longestValidParentheses(String s) {
		 Stack<Integer> stack = new Stack<>();
		 int result = 0 ;
		 //stack.push(-1);
		 for(int i = 0 ; i < s.length() ;i++) {
			 if(s.charAt(i)=='('&&stack.size()>0&& s.charAt(stack.peek())==')') {
				 stack.pop();
				 result = Math.max(result, i-stack.peek());
			 }else {
				 stack.push(i);
			 }
		 }
		 return result ;
	 }
}
