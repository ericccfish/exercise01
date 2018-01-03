import java.util.*;

/**
 * Created by chenjianfeng on 2017/10/3.
 */
public class Solution64 {
    public ArrayList<Integer> maxInWindows(int[] num, int size){
        if(num.length==0 || size==0)
            return new ArrayList<Integer>();
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(num.length,Collections.reverseOrder());
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0; i<num.length; i++){
            if(i>=size)
                pQueue.remove(num[i-size]);
            pQueue.offer(num[i]);
            if(i+1>=size)
                res.add(pQueue.peek());
        }
        return res;
    }

    public ArrayList<Integer> maxInWindowsWithDeQueue(int[] num, int size){
        if(num.length==0 || size==0)
            return new ArrayList<Integer>();
        LinkedList<Integer> deque = new LinkedList<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0; i<num.length; i++){
            if(!deque.isEmpty() && deque.peekFirst()<=i-size)
                deque.removeFirst();
            while(!deque.isEmpty() && num[deque.peekLast()]<=num[i])
                deque.removeLast();
            deque.offerLast(i);
            if(i+1>=size)
                res.add(num[deque.peekFirst()]);
        }
        return res;
    }

    public static void main(String[] args) throws Exception{
        Solution64 sl = new Solution64();
        int[] arr = new int[]{2,3,4,2,6,2,5,1};
        System.out.println(sl.maxInWindows(arr,3));
        System.out.println(sl.maxInWindowsWithDeQueue(arr,3));
    }
}
