package 算法训练;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.naming.spi.DirStateFactory.Result;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Main24 {
//	 public static ListNode reverseKGroup(ListNode head, int k) {
//		 	if(head == null || k < 2) {
//		 		return head ;
//		 	}
//	        Stack<ListNode> stack = new Stack<>();
//	        ListNode p = new ListNode(0);
//	        ListNode result = p;
//	        while(head != null) {
//	        	stack.push(head) ;
//	        	head = head.next ;
//	        	if(stack.size() == k) {
//	        		for(int i = 0 ; i < k ; i++) {
//	        			p.next = stack.pop();
//	        			p = p.next ;
//	        		}
//	        	}
//	        }
//	        if(!stack.isEmpty()) {
//	        	for(int i = 0 ; i < stack.size()-1;i++) {
//	        		stack.pop();
//	        	}
//	        	p.next = stack.pop();
//	        }
//	        return result.next ;
//	 }
	public ListNode reverseKGroup(ListNode head, int k) {
		if(k < 2 || head == null) {
			return head ;
		}
		List<Integer> node_num = new ArrayList<>();
		ListNode p = head ;
		while(p!=null) {
			node_num.add(p.val);
			p = p.next ;
		}
		if(node_num.size()<k) {
			return head ;
		}
		ListNode p2 = head ;
		int i ;
		for(i = 1 ; i <= node_num.size()/k ;i++) {
			int j = i * k ;
			for(;j>(i-1)*k;j--) {
				p2.val = node_num.get(j-1);
				p2 = p2.next ;
			}
		}
		if(node_num.size()%k!=0) {
			for(int j = i * k ; j < node_num.size() ;j++) {
				p2.val = node_num.get(j) ;
				p2 = p2.next ;
			}
		}
		return head ;
		
	}
	 
}
