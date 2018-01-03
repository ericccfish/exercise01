/**
 * Created by chenjianfeng on 2017/9/15.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class Solution22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root==null)
            return new ArrayList<Integer>();
        ArrayList<Integer> res = new ArrayList();
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode pNode = queue.poll();
            res.add(pNode.val);
            if(pNode.left!=null)
                queue.offer(pNode.left);
            if(pNode.right!=null)
                queue.offer(pNode.right);
        }
        return res;
    }

    public static void main(String[] args) throws Exception{
        TreeNode root = new TreeNode(1);
        TreeNode l = new TreeNode(2);
        TreeNode r = new TreeNode(3);
        TreeNode lr = new TreeNode(4);
        TreeNode rl = new TreeNode(5);
        TreeNode rr = new TreeNode(6);
        root.left = l;
        root.right = r;
        l.right = lr;
        r.left = rl;
        r.right = rr;

        Solution22 sl = new Solution22();
        ArrayList<Integer> res = sl.PrintFromTopToBottom(root);
        System.out.println(res);
    }
}
