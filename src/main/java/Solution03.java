/**
 * Created by chenjianfeng on 2017/9/12.
 */
import java.util.ArrayList;

class ListNode{
    int val;
    ListNode next = null;

    ListNode(int val){
        this.val = val;
    }
}
public class Solution03 {
    ArrayList<Integer> res = new ArrayList();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode!=null){
            this.printListFromTailToHead(listNode.next);
            res.add(listNode.val);
        }
        return res;
    }

    public static void main(String[] args) throws Exception{
        ListNode head = new ListNode(1);
        ListNode pNode = head;
        for(int i=2; i<10; i++){
            pNode.next = new ListNode(i);
            pNode = pNode.next;
        }

        Solution03 sl = new Solution03();
        System.out.println(sl.printListFromTailToHead(head));
    }
}
