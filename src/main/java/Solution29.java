import java.util.ArrayList;

/**
 * Created by chenjianfeng on 2017/9/24.
 */
public class Solution29 {
    ArrayList<Integer> res = new ArrayList<Integer>();
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(k>input.length || k==0)
            return res;
        return findKLeastNumbers(input, 0, input.length-1, k);

    }

    public ArrayList<Integer> findKLeastNumbers(int[] arr, int left, int right, int k){
        if(arr.length==0)
            return new ArrayList<Integer>();
        int idx = partition(arr, left, arr.length-1);
        if(k==idx+1){
            for(int i=0; i<k; i++)
                res.add(arr[i]);
        }
        else if(k<idx+1){
            findKLeastNumbers(arr, left, idx-1, k);
        }
        else
            findKLeastNumbers(arr, idx+1, right, k);
        return res;
    }

    public int partition(int[] arr, int left, int right){
        if(left>=right)
            return left;
        int pivot = arr[left];
        while(left<right){
            while(left<right && arr[right]>=pivot)
                right--;
            if(left<right) {
                arr[left] = arr[right];
                left++;
            }
            while(left<right && arr[left]<=pivot)
                left++;
            if(left<right){
                arr[right] = arr[left];
                right--;
            }
        }
        arr[left] = pivot;
        return left;
    }
    public static void main(String[] args) throws Exception{
        int[] arr = new int[]{4,3,2,8,9,10,11,7,6};
        Solution29 sl = new Solution29();
        System.out.println(sl.GetLeastNumbers_Solution(arr, 5));
    }
}
