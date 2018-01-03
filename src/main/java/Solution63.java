import java.util.ArrayList;

/**
 * Created by chenjianfeng on 2017/10/2.
 */
public class Solution63 {
    private ArrayList<Integer> stream = new ArrayList<Integer>();
    public void Insert(Integer num){
        this.stream.add(num);
    }

    public Double GetMedian(){
        if(this.stream.size()==0)
            return 0.0;
        int len = this.stream.size();
        if(len%2==0){
            int k = len/2;
            int high = getKthNum(this.stream, 0, len-1, k);
            int low = getMax(this.stream, 0, k-1);
            return (high+low)/2.0;
        }
        else
            return 1.0 * getKthNum(this.stream, 0, len-1, (len-1)/2);
    }

    public int getMax(ArrayList<Integer> arr, int left, int right){
        int max = Integer.MIN_VALUE;
        for(int i=left; i<=right; i++){
            if(arr.get(i)>max)
                max = arr.get(i);
        }
        return max;
    }

    public int getKthNum(ArrayList<Integer> arr, int left, int right, int k){
        if(arr.size()==0)
            return 0;
        int idx = partition(arr, left, right);
        if(idx==k)
            return arr.get(idx);
        else if(idx<k)
            return getKthNum(arr, idx+1, right, k);
        else
            return getKthNum(arr, left, idx-1,k);
    }

    public int partition(ArrayList<Integer> arr, int left, int right){
        if(left>=right)
            return left;
        int pivot = arr.get(left);
        while(left<right){
            while(left<right && arr.get(right)>=pivot)
                right--;
            if(left<right) {
                arr.set(left, arr.get(right));
                left++;
            }
            while(left<right && arr.get(left)<=pivot)
                left++;
            if(left<right) {
                arr.set(right, arr.get(left));
                right--;
            }
        }
        arr.set(left, pivot);
        return left;
    }

    public static void main(String[] args) throws Exception{
        Solution63 sl = new Solution63();
        int[] arr = new int[]{5,2,3,4,1,6,7,0,8};
        for(int i=0; i<arr.length; i++){
            sl.Insert(arr[i]);
            System.out.println(sl.GetMedian());
        }
    }
}
