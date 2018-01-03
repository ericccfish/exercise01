/**
 * Created by chenjianfeng on 2017/9/13.
 */
public class Solution17 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null || root2==null)
            return false;

        boolean isFound = false;
        if(root1.val==root2.val){
            if(root2.left!=null && root2.right==null)
                isFound = HasSubtree(root1.left, root2.left);
            else if(root2.left==null && root2.right!=null)
                isFound = HasSubtree(root1.right, root2.right);
            else if(root2.left!=null && root2.right!=null)
                isFound = HasSubtree(root1.left, root2.left) && HasSubtree(root1.right, root2.right);
            else
                isFound = true;
        }
        if(isFound)
            return true;
        else
            return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    public static void main(String[] args) throws Exception{
        TreeNode node11 = new TreeNode(8);
        TreeNode node12 = new TreeNode(8);
        TreeNode node13 = new TreeNode(9);
        TreeNode node14 = new TreeNode(2);
        TreeNode node15 = new TreeNode(4);
        TreeNode node16 = new TreeNode(7);
        TreeNode node17 = new TreeNode(7);
        node11.left = node12;
        node12.left = node13;
        node12.right = node14;
        node14.left = node15;
        node14.right = node16;
        node11.right = node17;

        TreeNode node21 = new TreeNode(8);
        TreeNode node22 = new TreeNode(9);
        TreeNode node23 = new TreeNode(2);
        node21.left = node22;
        node21.right = node23;

        Solution17 sl = new Solution17();
        System.out.println(sl.HasSubtree(node11, node21));
    }
}
