/**
 * Created by chenjianfeng on 2017/10/2.
 */
public class Solution61 {
    private static int prePointer;
    public String preOrderTraversal(TreeNode root, StringBuffer sb){
        if(root!=null){
            sb.append(root.val+",");
            preOrderTraversal(root.left, sb);
            preOrderTraversal(root.right, sb);
        }else{
            sb.append("#,");
        }
        return sb.toString();
    }
    public TreeNode build(TreeNode root, String[] arr, int i){
        if(i<arr.length){
            if(!arr[i].equals("#")) {
                root = new TreeNode(Integer.parseInt(arr[i]));
                root.left = build(root.left, arr, ++prePointer);
                root.right = build(root.right, arr, ++prePointer);
            }
        }
        return root;
    }
    public String Serialize(TreeNode root){
        StringBuffer sb = new StringBuffer();
        return preOrderTraversal(root, sb);
    }

    public TreeNode Deserialize(String str){
        String[] arr = str.split(",");
        prePointer = 0;
        return build(null, arr, 0);
    }

    public static void main(String[] args) throws Exception{
        TreeNode root = new TreeNode(5);
        TreeNode l = new TreeNode(4);
        TreeNode lr = new TreeNode(3);
        TreeNode lrr = new TreeNode(2);
        root.left = l;
        l.right = lr;
        lr.right = lrr;
        Solution61 sl = new Solution61();
        String ser = sl.Serialize(root);
        System.out.println("序列化：");
        System.out.println(ser);
        TreeNode tmp = sl.Deserialize(ser);
        System.out.println("反序列化后再序列化：");
        System.out.println(sl.Serialize(tmp));
    }
}
