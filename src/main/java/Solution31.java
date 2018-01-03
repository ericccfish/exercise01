/**
 * Created by chenjianfeng on 2017/9/29.
 */
public class Solution31 {
    public int NumberOf1Between1AndN_Solution(int n){
        int num = 0;
        int base = 1;
        int former = 0;
        while(n!=0){
            int round = n/10;
            int weight = n%10;
            if(weight>1)
                num += (round*base + base);
            else if(weight==1)
                num += (round*base + former+1);
            else
                num += (round*base);
            former += base*(n%10);
            n = n/10;
            base = base*10;
        }
        return num;
    }

    public static void main(String[] args) throws Exception{
        Solution31 sl = new Solution31();
        System.out.println(sl.NumberOf1Between1AndN_Solution(10));
    }
}
