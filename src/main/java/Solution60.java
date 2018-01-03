import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by chenjianfeng on 2017/10/2.
 */
public class Solution60 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
        if(pRoot==null)
            return new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> oddQueue = new LinkedList<TreeNode>();
        Queue<TreeNode> evenQueue = new LinkedList<TreeNode>();
        oddQueue.offer(pRoot);
        while(!oddQueue.isEmpty() || !evenQueue.isEmpty()){
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            if(!oddQueue.isEmpty()){
                while(!oddQueue.isEmpty()){
                    TreeNode pNode = oddQueue.poll();
                    tmp.add(pNode.val);
                    if(pNode.left!=null)
                        evenQueue.offer(pNode.left);
                    if(pNode.right!=null)
                        evenQueue.offer(pNode.right);
                }
            }else if(!evenQueue.isEmpty()){
                while(!evenQueue.isEmpty()){
                    TreeNode pNode = evenQueue.poll();
                    tmp.add(pNode.val);
                    if(pNode.left!=null)
                        oddQueue.offer(pNode.left);
                    if(pNode.right!=null)
                        oddQueue.offer(pNode.right);
                }
            }
            res.add(tmp);
        }
        return res;
    }

    public static void main(String[] args) throws  Exception{
        TreeNode root = new TreeNode(1);
        TreeNode l = new TreeNode(2);
        TreeNode r = new TreeNode(3);
        TreeNode ll = new TreeNode(4);
        TreeNode rr = new TreeNode(5);
        root.left = l;
        root.right = r;
        l.left = ll;
        r.right = rr;
        Solution60 sl = new Solution60();
        ArrayList<ArrayList<Integer>> res = sl.Print(root);
        for(ArrayList<Integer> list: res){
            System.out.println(list);
        }
    }
}
