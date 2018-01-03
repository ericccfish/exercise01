/**
 * Created by chenjianfeng on 2017/10/2.
 */
public class Solution58 {
    public boolean isMirror(TreeNode pLeft, TreeNode pRight){
        if(pLeft==null && pRight==null)
            return true;
        else if(pLeft!=null && pRight!=null){
            return pLeft.val==pRight.val && isMirror(pLeft.left, pRight.right) &&
                    isMirror(pLeft.right, pRight.left);
        }
        return false;
    }
    public boolean isSymmetrical(TreeNode pRoot){
        if(pRoot==null)
            return true;
        return isMirror(pRoot.left, pRoot.right);
    }

    public static void main(String[] args) throws Exception{
        TreeNode root = new TreeNode(1);
        TreeNode l = new TreeNode(2);
        TreeNode r = new TreeNode(2);
        TreeNode ll = new TreeNode(4);
        TreeNode rr = new TreeNode(4);
        root.left = l;
        root.right = r;
        l.left = ll;
        r.right = rr;
        Solution58 sl = new Solution58();
        System.out.println(sl.isSymmetrical(root));
    }
}
