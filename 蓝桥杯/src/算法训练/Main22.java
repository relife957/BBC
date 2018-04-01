package 算法训练;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }
public class Main22 {
	 public ListNode mergeKLists(List<ListNode> lists) {
		 if(lists.size() == 0) {
			 return null ;
		 }
		 if(lists.size() == 1) {
			 return lists.get(0);
		 }
		 if(lists.size() == 2) {
			 return mergeTwoLists(lists.get(0), lists.get(1)) ;
		 }
		 return mergeTwoLists(mergeKLists(lists.subList(0, lists.size()/2)),
				 mergeKLists(lists.subList(lists.size()/2,lists.size())));
	     
	    }
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        ListNode result = new ListNode(0);
	        ListNode p = result ;
	        while(l1!=null || l2!=null) {
	        	if(l1==null) {
	        		p.next = l2 ;
	        		break ;
	        	}else if(l2 == null) {
	        		p.next = l1 ;
	        		break ;
	        	}
	        	if(l1.val<=l2.val) {
	        		p.next = l1 ;
	        		p = p.next ;
	        		l1 = l1.next ;
	        	}else {
	        		p.next = l2 ;
	        		p = p.next ;
	        		l2 = l2.next ;
	        	}
	        }
	        return result.next ;
	    }
	
}
