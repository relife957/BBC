package 算法训练;

class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
public class Main23 {
	 public ListNode swapPairs(ListNode head) {
	      ListNode p = head ;
	      int count = 0 ;
	      while(p!=null) {
	    	  count++ ;
	    	  int temp = p.val ;
	    	  if(p.next!=null) {
	    		  p.val = p.next.val;
	    	  }else {
	    		  break ;
	    	  }
	    	  p.next.val = temp ;
	    	  if(count==1) {
	    		 head = p ;
	    	  }
	    	  p = p.next.next ;
	      }
	      return head ;
	      
	 }
}
