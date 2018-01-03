/**
 * Created by chenjianfeng on 2017/9/15.
 */
public class Solution23 {
    public boolean isBST(int[] sequence, int left, int right){
        if(left>=right)
            return true;
        int i = left;
        while(i<right && sequence[i]<=sequence[right])
            i++;
        int j = i;
        while(j<right && sequence[j]>sequence[right])
            j++;
        if(j<right)
            return false;
        return isBST(sequence, left, i-1) && isBST(sequence, i, right-1);
    }
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0)
            return false;
        return isBST(sequence, 0, sequence.length-1);
    }
    public static void main(String[] args) throws Exception{
        int[] arr = new int[]{2,7,6,11,20,12,10};
        Solution23 sl = new Solution23();
        System.out.println(sl.VerifySquenceOfBST(arr));
    }
}
