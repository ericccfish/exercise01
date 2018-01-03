/**
 * Created by chenjianfeng on 2017/9/14.
 */
import java.util.Stack;

public class Solution21 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA.length != popA.length || pushA.length == 0 || popA.length == 0)
            return false;
        Stack<Integer> st = new Stack();
        int p = 0;
        int k = 0;
        st.push(pushA[p++]);
        while (!st.isEmpty()) {
            if (st.peek() == popA[k]) {
                st.pop();
                k++;
            }
            else if(p<pushA.length) {
                st.push(pushA[p++]);
            }
            else
                break;
        }
        if(k == popA.length)
            return true;
        return false;
    }

    public static void main(String[] args) throws Exception{
        int[] pushA = new int[]{1,2,3,4,5};
        int[] popA = new int[]{4,5,3,2,1};
        Solution21 sl = new Solution21();
        System.out.println(sl.IsPopOrder(pushA, popA));
    }
}
