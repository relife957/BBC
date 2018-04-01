package 算法训练;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

class Solution {
	public static int reach(ListNode node) {
		ListNode temp = node ;
		int result = 0 ;
		int flag = 1 ;
		while(temp!=null) {
			result += temp.val*flag ;
			temp = temp.next ;
			flag *= 10 ;
		}
		return result;
	}
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode temp1 = l1 ;
        ListNode temp2 = l2 ;
    	ListNode temp = new ListNode(0) ;
    	ListNode result = temp;
        int flag = 0 ;
        while(temp2!=null || temp1!=null){
            int sum = 0;
            sum += flag ;
            if(temp1!=null){
                sum+=temp1.val ;
                temp1 = temp1.next ;
            }
            if(temp2!=null){
                sum+=temp2.val ;
                temp2 = temp2.next ;
            }
            if(sum < 10){
                temp.next = new ListNode(sum) ;
                flag = 0 ;
            }else{
                temp.next = new ListNode(sum%10) ;
                flag = sum/10 ;
            }
            temp = temp.next ;
            
        }
        if(flag!=0) {
        	temp.val = flag ;
        }else {
        	
        	temp = null ;
        }
        return result.next ;
    
    }
}

public class Main2{
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
//		ListNode l1 = new ListNode(9);
//		ListNode l2 = new ListNode(1);
//		l2.next = new ListNode(9);
//		l2.next.next = new ListNode(9);
//		l2.next.next.next = new ListNode(9);
//		l2.next.next.next.next = new ListNode(9);
//		l2.next.next.next.next.next = new ListNode(9);
		//l2.next = new ListNode(9);
		ListNode sListNode = Solution.addTwoNumbers(l1, l2);
		while(sListNode!=null) {
			System.out.println(sListNode.val);
			sListNode = sListNode.next;
		}
	}
}