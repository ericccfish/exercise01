/**
 * Created by chenjianfeng on 2017/9/30.
 */
public class Solution47 {
    public int Sum_Solution(int n) {
        int ans = n;
        boolean t = (ans>0) && ((ans += Sum_Solution(n-1))>0);
        return ans;
    }

    public static void main(String[] args) throws Exception{
        Solution47 sl = new Solution47();
        System.out.println(sl.Sum_Solution(100));
    }
}
