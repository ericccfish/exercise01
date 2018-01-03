/**
 * Created by chenjianfeng on 2017/9/30.
 */
public class Solution48 {
    public int Add(int num1,int num2) {
        int sum = num1;
        while(num2!=0){
            sum = num1^num2;
            int carry = (num1&num2)<<1;
            num1 = sum;
            num2 = carry;
        }
        return sum;
    }

    public static void main(String[] args) throws Exception{
        Solution48 sl = new Solution48();
        System.out.println(sl.Add(11,27));
    }
}
