/**
 * Created by chenjianfeng on 2017/9/15.
 */
import java.util.ArrayList;

public class Solution24 {
    ArrayList<ArrayList<Integer>> res = new ArrayList();
    ArrayList<Integer> path = new ArrayList();
    public void findOnePath(TreeNode root, int target){
        if(root!=null) {
            path.add(root.val);
            if (root.left != null)
                findOnePath(root.left, target - root.val);
            if (root.right != null)
                findOnePath(root.right, target - root.val);
            if (target == root.val && root.left == null && root.right == null) {
                ArrayList<Integer> p = new ArrayList();
                for(int i=0; i<path.size(); i++)
                    p.add(path.get(i));
                res.add(p);
            }
            path.remove(path.size() - 1);
        }
    }
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root==null)
            return res;
        findOnePath(root, target);
        return res;
    }
    public static void main(String[] args) throws Exception{
        TreeNode root = new TreeNode(1);
        TreeNode l = new TreeNode(2);
        TreeNode r = new TreeNode(3);
        TreeNode lr = new TreeNode(4);
        TreeNode rl = new TreeNode(5);
        TreeNode rr = new TreeNode(3);
        root.left = l;
        root.right = r;
        l.right = lr;
        r.left = rl;
        r.right = rr;

        ArrayList<ArrayList<Integer>> arr = new ArrayList();
        Solution24 sl = new Solution24();
        arr = sl.FindPath(root, 7);
        System.out.println(arr);
    }
}
