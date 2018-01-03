import java.util.ArrayList;

/**
 * Created by chenjianfeng on 2017/10/2.
 */
public class Solution62 {
    private int counter = 0;
    public TreeNode KthNode(TreeNode pRoot, int k){
        if(pRoot!=null && k>0){
            TreeNode node = KthNode(pRoot.left, k);
            if(node!=null)
                return node;
            counter++;
            if(counter==k)
                return pRoot;
            node = KthNode(pRoot.right, k);
            if(node!=null)
                return node;
        }
        return null;
    }

    public static void main(String[] args) throws Exception{
        TreeNode root = new TreeNode(5);
        TreeNode l = new TreeNode(3);
        TreeNode r = new TreeNode(7);
        TreeNode ll = new TreeNode(2);
        TreeNode lr = new TreeNode(4);
        TreeNode rl = new TreeNode(6);
        TreeNode rr = new TreeNode(8);
        root.left = l;
        root.right = r;
        l.left = ll;
        l.right = lr;
        r.left = rl;
        r.right = rr;
        Solution62 sl = new Solution62();
        System.out.println(sl.KthNode(root,3).val);
    }
}
