/**
 * Created by chenjianfeng on 2017/9/13.
 */
public class Solution11 {
    public int NumberOf1(int n) {
        int flag = 1;
        int counts = 0;
        while(flag!=0){
            if((n&flag)!=0)
                counts++;
            flag = flag<<1;
        }
        return counts;
    }

    public static void main(String[] args) throws Exception{
        Solution11 sl = new Solution11();
        System.out.println(sl.NumberOf1(-11));
    }
}
