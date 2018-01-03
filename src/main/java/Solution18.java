/**
 * Created by chenjianfeng on 2017/9/13.
 */
public class Solution18 {
    public void Mirror(TreeNode root) {
        if(root!=null){
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            Mirror(root.left);
            Mirror(root.right);
        }
    }
    public void printTree(TreeNode root){
        if(root!=null){
            System.out.println(root.val);
            printTree(root.left);
            printTree(root.right);
        }
    }

    public static void main(String[] args) throws Exception{
        TreeNode node11 = new TreeNode(8);
        TreeNode node12 = new TreeNode(6);
        TreeNode node13 = new TreeNode(10);
        TreeNode node14 = new TreeNode(5);
        TreeNode node15 = new TreeNode(7);
        TreeNode node16 = new TreeNode(9);
        TreeNode node17 = new TreeNode(11);
        node11.left = node12;
        node11.right = node13;
        node12.left = node14;
        node12.right = node15;
        node13.left = node16;
        node13.right = node17;

        Solution18 sl = new Solution18();
        sl.Mirror(node11);
        sl.printTree(node11);
    }
}
