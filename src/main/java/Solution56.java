/**
 * Created by chenjianfeng on 2017/10/1.
 */
public class Solution56 {
    public ListNode deleteDuplication(ListNode pHead){
        if(pHead==null || pHead.next==null)
            return pHead;
        if(pHead.val!=pHead.next.val)
            pHead.next = deleteDuplication(pHead.next);
        else{
            while(pHead.next!=null && pHead.val==pHead.next.val)
                pHead = pHead.next;
            pHead = deleteDuplication(pHead.next);
        }
        return pHead;
    }

    public static void main(String[] args) throws Exception{
        int[] arr = new int[]{1,1,1,2,3,4,4,4,5,6,6,6};
        ListNode pHead = new ListNode(arr[0]);
        ListNode pNode = pHead;
        for(int i=1; i<arr.length; i++){
            pNode.next = new ListNode(arr[i]);
            pNode = pNode.next;
        }
        pNode = pHead;
        while(pNode!=null) {
            System.out.println(pNode.val);
            pNode = pNode.next;
        }
        System.out.println();
        Solution56 sl = new Solution56();
        pNode = sl.deleteDuplication(pHead);
        while(pNode!=null){
            System.out.println(pNode.val);
            pNode = pNode.next;
        }
    }
}
