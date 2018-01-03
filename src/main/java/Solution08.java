/**
 * Created by chenjianfeng on 2017/9/12.
 */
public class Solution08 {
    public int JumpFloor(int target) {
        if(target==0) return 0;
        int[] f = new int[target+1];
        f[0] = 1;
        f[1] = 1;
        for(int i=2; i<=target; i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[target];
    }

    public static void main(String[] args) throws Exception{
        Solution08 sl = new Solution08();
        System.out.println(sl.JumpFloor(10));
    }
}
