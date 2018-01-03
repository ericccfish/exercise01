import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by chenjianfeng on 2017/10/2.
 */
public class Solution59 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(pRoot==null)
            return res;
        Stack<TreeNode> left2Right = new Stack<TreeNode>();
        Stack<TreeNode> right2Left = new Stack<TreeNode>();
        left2Right.add(pRoot);
        while(!left2Right.isEmpty() || !right2Left.isEmpty()){
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            if(!left2Right.isEmpty()){
                while(!left2Right.isEmpty()) {
                    TreeNode pNode = left2Right.pop();
                    tmp.add(pNode.val);
                    if(pNode.left!=null)
                        right2Left.push(pNode.left);
                    if(pNode.right!=null)
                        right2Left.push(pNode.right);
                }
            }else if(!right2Left.isEmpty()) {
                while (!right2Left.isEmpty()) {
                    TreeNode pNode = right2Left.pop();
                    tmp.add(pNode.val);
                    if(pNode.right!=null)
                        left2Right.push(pNode.right);
                    if(pNode.left!=null)
                        left2Right.push(pNode.left);
                }
            }
            res.add(tmp);
        }
        return res;
    }

    public static void main(String[] args) throws Exception{
        TreeNode root = new TreeNode(1);
        TreeNode l = new TreeNode(2);
        TreeNode r = new TreeNode(3);
        TreeNode ll = new TreeNode(4);
        TreeNode rr = new TreeNode(5);
        root.left = l;
        root.right = r;
        l.left = ll;
        r.right = rr;
        Solution59 sl = new Solution59();
        ArrayList<ArrayList<Integer>> res = sl.Print(root);
        for(ArrayList<Integer> list: res){
            System.out.println(list);
        }
    }
}
