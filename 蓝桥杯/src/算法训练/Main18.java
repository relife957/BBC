package 算法训练;

public class Main18 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        //获得链表的长度
		ListNode p = head ;
		int length = 0 ;
		while(p!=null) {
			length++ ;
			p = p.next ;
		}
		ListNode temp = head ;
		int count = 0; 
		while(temp!=null) {
			count++ ;
			if(count==length) break ;
			temp = temp.next;
		}
		temp.next = temp.next.next ;
		return head ;
		
    }
}
