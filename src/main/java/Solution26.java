/**
 * Created by chenjianfeng on 2017/9/15.
 */
public class Solution26 {
    private TreeNode lastNodeInList = null;
    public TreeNode ConvertNode(TreeNode root){
        if(root==null)
            return null;
        if(root.left!=null)
            ConvertNode(root.left);
        root.left = lastNodeInList;
        if(lastNodeInList!=null)
            lastNodeInList.right = root;
        lastNodeInList = root;
        if(root.right!=null)
            ConvertNode(root.right);
        return lastNodeInList;
    }
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null){
            return pRootOfTree;
        }
        TreeNode listHead = ConvertNode(pRootOfTree);
        while(listHead.left!=null){
            listHead = listHead.left;
        }
        return listHead;
    }

    public static void main(String[] args) throws Exception{
        TreeNode root = new TreeNode(20);
        TreeNode l = new TreeNode(13);
        TreeNode r = new TreeNode(39);
        TreeNode ll = new TreeNode(7);
        TreeNode lr = new TreeNode(15);
        TreeNode rl = new TreeNode(25);
        TreeNode rr = new TreeNode(48);
        TreeNode lll = new TreeNode(5);
        TreeNode lrl = new TreeNode(14);

        root.left = l;
        root.right = r;
        l.left = ll;
        l.right = lr;
        r.left = rl;
        r.right = rr;
        ll.left = lll;
        lr.left = lrl;

        Solution26 sl = new Solution26();
        TreeNode head = sl.Convert(root);
        TreeNode front = head;
        TreeNode back = head;
        while(front!=null){
            System.out.println(front.val);
            if(front.right==null)
                back = front;
            front = front.right;
        }
        System.out.println();

        while(back!=null){
            System.out.println(back.val);
            back = back.left;
        }
    }
}
