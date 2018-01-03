/**
 * Created by chenjianfeng on 2017/9/13.
 */

public class Solution14 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null || k==0)
            return null;
        ListNode firstNode = head;
        ListNode secondNode = head;
        while(k>1){
            if(firstNode.next!=null){
                firstNode = firstNode.next;
                k--;
            }
            else
                return null;
        }
        while(firstNode.next!=null){
            firstNode = firstNode.next;
            secondNode = secondNode.next;
        }
        return secondNode;
    }

    public static void main(String[] args) throws Exception{
        ListNode head = new ListNode(1);
        ListNode pNode = head;
        for(int i=2; i<10; i++){
            pNode.next = new ListNode(i);
            pNode = pNode.next;
        }

        Solution14 sl = new Solution14();
        System.out.println(sl.FindKthToTail(head, 0).val);
    }
}
