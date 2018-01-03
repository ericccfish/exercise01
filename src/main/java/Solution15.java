/**
 * Created by chenjianfeng on 2017/9/13.
 */
public class Solution15 {
    public ListNode ReverseList(ListNode head) {
        if(head==null)
            return null;
        ListNode pNode = null;
        ListNode curNode = head;
        ListNode headNode = head;
        while(curNode!=null){
            headNode = curNode.next;
            curNode.next = pNode;
            pNode = curNode;
            curNode = headNode;
        }
        return pNode;
    }

    public static void main(String[] args) throws Exception{
        ListNode head = new ListNode(1);
        ListNode pNode = head;
        for(int i=2; i<10; i++){
            pNode.next = new ListNode(i);
            pNode = pNode.next;
        }

        Solution15 sl = new Solution15();
        ListNode resNode = sl.ReverseList(head);
        while(resNode!=null){
            System.out.println(resNode.val);
            resNode = resNode.next;
        }
    }
}
