import java.util.ArrayList;

/**
 * Created by chenjianfeng on 2017/9/30.
 */
public class Solution42 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        if(array.length<=1)
            return new ArrayList<Integer>();
        int left = 0;
        int right = array.length-1;
        ArrayList<Integer> res = new ArrayList<Integer>();
        while(left<right){
            int cur = array[left]+array[right];
            if(cur<sum)
                left++;
            else if(cur>sum)
                right--;
            else {
                res.add(array[left]);
                res.add(array[right]);
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) throws Exception{
        int[] arr = new int[]{1,3,5,7,8,9,10};
        Solution42 sl = new Solution42();
        ArrayList<Integer> res = sl.FindNumbersWithSum(arr, 18);
        for(int i=0; i<res.size(); i++)
            System.out.print(res.get(i)+" ");
    }
}
