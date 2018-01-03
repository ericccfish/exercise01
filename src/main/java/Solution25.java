import java.util.Random;

/**
 * Created by chenjianfeng on 2017/9/15.
 */

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class Solution25 {
    public RandomListNode cloneNodes(RandomListNode pHead){
        if(pHead==null)
            return pHead;
        RandomListNode pNode = pHead;
        while(pNode!=null){
            RandomListNode cNode = new RandomListNode(pNode.label);
            cNode.next = pNode.next;
            pNode.next = cNode;
            pNode = cNode.next;
        }
        return pHead;
    }

    public RandomListNode reConnect(RandomListNode pHead){
        if(pHead==null || pHead.next==null)
            return pHead;
        RandomListNode pNode = pHead;
        while(pNode!=null && pNode.next!=null){
            if(pNode.random!=null)
                pNode.next.random = pNode.random.next;
            pNode = pNode.next.next;
        }
        return pHead;
    }

    public RandomListNode deleteOriginNodes(RandomListNode pHead){
        if(pHead==null || pHead.next==null)
            return pHead;
        RandomListNode cHead = pHead.next;
        pHead.next = null;
        RandomListNode pNode = cHead;
        while(pNode.next!=null){
            RandomListNode tmpNode = pNode.next;
            pNode.next = tmpNode.next;
            tmpNode.next = null;
            pNode = pNode.next;
        }
        return cHead;
    }

    public RandomListNode Clone(RandomListNode pHead)
    {
        pHead = cloneNodes(pHead);
        pHead = reConnect(pHead);
        return deleteOriginNodes(pHead);
    }

    public void printRandomList(RandomListNode pHead){
        if(pHead!=null) {
            RandomListNode pNode = pHead;
            while (pNode != null) {
                if (pNode.next != null)
                    System.out.println(pNode.label + " --next--> " + pNode.next.label);
                else
                    System.out.println(pNode.label + " --next--> null");
                if (pNode.random != null)
                    System.out.println(pNode.label + " --random--> " + pNode.random.label);
                else
                    System.out.println(pNode.label + " --random--> null");
                pNode = pNode.next;
            }
        }
    }
    public static void main(String[] args) throws Exception{
        RandomListNode A = new RandomListNode(1);
        RandomListNode B = new RandomListNode(2);
        RandomListNode C = new RandomListNode(3);
        RandomListNode D = new RandomListNode(4);
        RandomListNode E = new RandomListNode(5);

        A.next = B;
        A.random = C;
        B.next = C;
        B.random = E;
        C.next = D;
        D.next = E;
        D.random = B;

        Solution25 sl = new Solution25();
        RandomListNode cHead = sl.Clone(A);
        sl.printRandomList(cHead);
    }
}
