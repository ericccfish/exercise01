/**
 * Created by chenjianfeng on 2017/10/1.
 */
class TreeLinkNode{
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val){
        this.val = val;
    }
}
public class Solution57 {
    public TreeLinkNode GetNext(TreeLinkNode pNode){
        if(pNode==null)
            return null;
        if(pNode.right!=null){
            pNode = pNode.right;
            while(pNode.left!=null)
                pNode = pNode.left;
            return pNode;
        }
        TreeLinkNode parent = pNode.next;
        if(parent!=null){
            if(pNode==parent.left)
                return parent;
            else{
                while(parent.next!=null && parent!=parent.next.left)
                    parent = parent.next;
                return parent.next;
            }
        }
        return null;
    }

    public static void main(String[] args) throws Exception{
        TreeLinkNode root = new TreeLinkNode(1);
        TreeLinkNode l = new TreeLinkNode(2);
        TreeLinkNode r = new TreeLinkNode(3);
        TreeLinkNode ll = new TreeLinkNode(4);
        TreeLinkNode lr = new TreeLinkNode(5);
        TreeLinkNode rl = new TreeLinkNode(6);
        TreeLinkNode rr = new TreeLinkNode(7);
        TreeLinkNode lrl = new TreeLinkNode(8);
        TreeLinkNode lrr = new TreeLinkNode(9);
        root.left = l;
        root.right = r;
        l.left = ll;
        l.right = lr;
        l.next = root;
        r.left = rl;
        r.right = rr;
        r.next = root;
        lr.left = lrl;
        lr.right = lrr;
        lr.next = l;
        ll.next = l;
        rl.next = r;
        rr.next = r;
        lrl.next = lr;
        lrr.next = lr;

        Solution57 sl = new Solution57();
        System.out.println(sl.GetNext(lrr).val);
    }
}
