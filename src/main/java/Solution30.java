/**
 * Created by chenjianfeng on 2017/9/24.
 */
public class Solution30 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length==0)
            return 0;
        int[] dp = new int[array.length];
        dp[0] = array[0];
        for(int i=1; i<array.length; i++) {
            if(dp[i-1]<0)
                dp[i] = array[i];
            else
                dp[i] = array[i] + dp[i - 1];
        }
        int max = dp[0];
        for(int i=1; i<dp.length; i++){
            if(dp[i]>max)
                max = dp[i];
        }
        return max;
    }

    public static void main(String[] args) throws Exception{
        int[] arr = new int[]{1,-2,3,10,-4,7,2,-5};
        Solution30 sl = new Solution30();
        System.out.println(sl.FindGreatestSumOfSubArray(arr));
    }
}
