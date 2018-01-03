/**
 * Created by chenjianfeng on 2017/9/29.
 */
public class Solution33 {
    public int getMin(int a, int b, int c){
        if(a<=b && a<=c)
            return a;
        else if(b<=a && b<=c)
            return b;
        else
            return c;
    }
    public int GetUglyNumber_Solution(int index) {
        if(index==0)
            return 0;
        int[] table = new int[index];
        table[0] = 1;
        int t2=0, t3=0, t5=0;
        for(int i=1; i<index; i++){
            int min = getMin(table[t2]*2, table[t3]*3, table[t5]*5);
            table[i] = min;
            if(table[t2]*2==min) t2++;
            if(table[t3]*3==min) t3++;
            if(table[t5]*5==min) t5++;
        }
        return table[index-1];
    }

    public static void main(String[] args) throws Exception{
        Solution33 sl = new Solution33();
        System.out.println(sl.GetUglyNumber_Solution(13));
    }
}
