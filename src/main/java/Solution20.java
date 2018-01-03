/**
 * Created by chenjianfeng on 2017/9/14.
 */
import java.util.Stack;

public class Solution20 {
    private Stack<Integer> st = new Stack();
    private Stack<Integer> minStack = new Stack();
    public void push(int node) {
        if(minStack.isEmpty())
            minStack.push(node);
        else{
            if(node<=st.peek())
                minStack.push(node);
        }
        st.push(node);
    }

    public void pop() {
        int p = st.pop();
        if(p==minStack.peek())
            minStack.pop();
    }

    public int top() {
        return st.peek();
    }

    public int min() {
        return minStack.peek();
    }

    public static void main(String[] args) throws Exception{
        Solution20 sl = new Solution20();
        sl.push(3);
        sl.push(2);
        sl.push(4);
        sl.push(5);
        System.out.println(sl.min());
    }
}
