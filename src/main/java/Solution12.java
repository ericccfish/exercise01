/**
 * Created by chenjianfeng on 2017/9/13.
 */
public class Solution12 {
    public double Power(double base, int exponent) {
        if(exponent==0)
            return 1;
        else if(exponent<0)
            return (1/base)*Power(1/base, -exponent-1);
        else
            return base*Power(base, exponent-1);
    }

    public static void main(String[] args) throws Exception{
        Solution12 sl = new Solution12();
        System.out.println(sl.Power(2,-8));
    }
}
