/**
 * Created by chenjianfeng on 2017/9/12.
 */

import java.util.Stack;
public class Solution05 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.size()==0){
            while(stack1.size()!=0)
                stack2.push(stack1.pop());
        }
        return stack2.size()>0? stack2.pop():0;
    }

    public static void main(String[] args) throws Exception{
        Solution05 sl = new Solution05();
        sl.push(1);
        sl.push(2);
        sl.push(3);
        System.out.println(sl.pop());
        System.out.println(sl.pop());
        sl.push(4);
        System.out.println(sl.pop());
        sl.push(5);
        System.out.println(sl.pop());
        System.out.println(sl.pop());
    }
}
