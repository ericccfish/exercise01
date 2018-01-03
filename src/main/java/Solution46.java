/**
 * Created by chenjianfeng on 2017/9/30.
 */
public class Solution46 {
    public int LastRemaining_Solution(int n, int m) {
        if(n==0 || m==0)
            return -1;
        ListNode pHead = new ListNode(0);
        ListNode pNode = pHead;
        for(int i=1; i<n; i++){
            pNode.next = new ListNode(i);
            pNode = pNode.next;
        }
        pNode.next = pHead;
        while(pNode.next!=pNode){
            for(int i=0; i<m-1; i++)
                pNode = pNode.next;
            pNode.next = pNode.next.next;
        }
        return pNode.val;
    }

    public static void main(String[] args) throws Exception{
        Solution46 sl = new Solution46();
        System.out.println(sl.LastRemaining_Solution(9,3));
    }
}
