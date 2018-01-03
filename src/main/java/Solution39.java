/**
 * Created by chenjianfeng on 2017/9/30.
 */
public class Solution39 {
    public int TreeDepth(TreeNode root){
        if(root==null)
            return 0;
        return Math.max(TreeDepth(root.left), TreeDepth(root.right)) + 1;
    }
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null)
            return true;
        return Math.abs(TreeDepth(root.left)-TreeDepth(root.right))<=1;
    }

    public static void main(String[] args) throws Exception{
        TreeNode root = new TreeNode(1);
        TreeNode l = new TreeNode(2);
        TreeNode r = new TreeNode(3);
        TreeNode ll = new TreeNode(4);
        TreeNode lll = new TreeNode(5);
        root.left = l;
        root.right = r;
        l.left = ll;
        ll.left = lll;
        Solution39 sl = new Solution39();
        System.out.println(sl.IsBalanced_Solution(root));
    }
}
