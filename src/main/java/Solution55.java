import com.sun.org.apache.bcel.internal.generic.LNEG;

/**
 * Created by chenjianfeng on 2017/10/1.
 */
public class Solution55 {
    public ListNode EntryNodeOfLoop(ListNode pHead){
        if(pHead==null)
            return null;
        ListNode fast = pHead;
        ListNode slow = pHead;
        while(fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                fast = pHead;
                while(fast!=slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }

    public static void main(String[] args) throws Exception{
        ListNode pHead = new ListNode(1);
        ListNode pNode = pHead;
        for(int i=2; i<=7; i++){
            pNode.next = new ListNode(i);
            pNode = pNode.next;
        }
        pNode.next = pHead.next.next;
        Solution55 sl = new Solution55();
        System.out.println(sl.EntryNodeOfLoop(pHead).val);
    }
}
