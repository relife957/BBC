package 算法训练;

class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
public class Main20 {
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
