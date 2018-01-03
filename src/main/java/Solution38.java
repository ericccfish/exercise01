/**
 * Created by chenjianfeng on 2017/9/30.
 */
public class Solution38 {
    public int TreeDepth(TreeNode root) {
        if(root==null)
            return 0;
        return Math.max(TreeDepth(root.left), TreeDepth(root.right)) + 1;
    }

    public static void main(String[] args) throws Exception{
        TreeNode root = new TreeNode(1);
        TreeNode l = new TreeNode(2);
        TreeNode r = new TreeNode(3);
        TreeNode ll = new TreeNode(4);
        root.left = l;
        root.right = r;
        l.left = ll;
        Solution38 sl = new Solution38();
        System.out.println(sl.TreeDepth(root));
    }
}
