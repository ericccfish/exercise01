/**
 * Created by chenjianfeng on 2017/9/12.
 */

import java.util.ArrayList;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x;}
}
public class Solution04 {
    public static int[] subArray(int[] arr, int left, int right){
        int len = right-left+1;
        int[] newArr = new int[len];
        for(int i=0;i<len;i++){
            newArr[i] = arr[left+i];
        }
        return newArr;
    }

    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length==0 || in.length==0)
            return null;
        TreeNode head = new TreeNode(pre[0]);
        int idx = 0;
        for(int i=0; i<in.length; i++){
            if(in[i] == pre[0]){
                idx = i;
                break;
            }
        }
        head.left = reConstructBinaryTree(subArray(pre, 1, idx), subArray(in, 0, idx-1));
        head.right = reConstructBinaryTree(subArray(pre, idx+1, pre.length-1), subArray(in, idx+1, in.length-1));
        return head;
    }

    public static void printTree(TreeNode pNode){
        if(pNode!=null) {
            System.out.println(pNode.val);
            printTree(pNode.left);
            printTree(pNode.right);
        }
    }

    public static void main(String[] args) throws Exception{
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        TreeNode head = reConstructBinaryTree(pre, in);
        printTree(head);
    }
}
