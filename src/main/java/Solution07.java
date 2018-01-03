/**
 * Created by chenjianfeng on 2017/9/12.
 */
public class Solution07 {
    public int Fibonacci(int n) {
        if(n==0) return 0;
        int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        for(int i=2; i<=n; i++)
            f[i] = f[i-2] + f[i-1];
        return f[n];
    }

    public static void main(String[] args) throws Exception{
        Solution07 sl = new Solution07();
        System.out.println(sl.Fibonacci(10));
    }
}
