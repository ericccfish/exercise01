/**
 * Created by chenjianfeng on 2017/9/30.
 */
public class Solution36 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null || pHead2==null)
            return null;
        int len1 = 0, len2 = 0;
        ListNode pNode1 = pHead1;
        ListNode pNode2 = pHead2;
        while(pNode1!=null){
            len1++;
            pNode1 = pNode1.next;
        }
        while(pNode2!=null){
            len2++;
            pNode2 = pNode2.next;
        }
        pNode1 = pHead1;
        pNode2 = pHead2;
        if(len2>len1){
            for(int i=0; i<len2-len1; i++)
                pNode2 = pNode2.next;
        }
        else{
            for(int i=0; i<len1-len2; i++)
                pNode1 = pNode1.next;
        }
        while(pNode1!=pNode2){
            pNode1 = pNode1.next;
            pNode2 = pNode2.next;
        }
        return pNode1;
    }

    public static void main(String[] args) throws Exception{
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode pHead1 = node1;
        ListNode pHead2 = node3;
        Solution36 sl = new Solution36();
        System.out.println(sl.FindFirstCommonNode(pHead1,pHead2).val);
    }
}
