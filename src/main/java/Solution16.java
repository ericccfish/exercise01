/**
 * Created by chenjianfeng on 2017/9/13.
 */
public class Solution16 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null || list2==null)
            return list1==null? list2:list1;
        if(list1.val<list2.val){
            list1.next = Merge(list1.next, list2);
            return list1;
        }
        else{
            list2.next = Merge(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) throws Exception{
        ListNode head1 = new ListNode(1);
        ListNode pNode1 = head1;
        for(int i=2; i<10; i++){
            pNode1.next = new ListNode(i*2);
            pNode1 = pNode1.next;
        }

        ListNode head2 = new ListNode(1);
        ListNode pNode2 = head2;
        for(int i=2; i<10; i++){
            pNode2.next = new ListNode(i);
            pNode2 = pNode2.next;
        }

        Solution16 sl = new Solution16();
        ListNode resNode = sl.Merge(head1, head2);
        while(resNode!=null){
            System.out.println(resNode.val);
            resNode = resNode.next;
        }
    }
}
