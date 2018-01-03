/**
 * Created by chenjianfeng on 2017/9/12.
 */
public class Solution09 {
    public int JumpFloorII(int target) {
        if(target==0) return 0;
        int[] f = new int[target+1];
        f[0] = 1;
        f[1] = 1;
        for(int i=2; i<=target; i++){
            for(int j=1; j<=i; j++)
                f[i] = f[i] + f[i-j];
        }
        return f[target];
    }

    public static void main(String[] args) throws Exception{
        Solution09 sl = new Solution09();
        System.out.println(sl.JumpFloorII(3));
    }
}
