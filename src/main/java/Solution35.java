/**
 * Created by chenjianfeng on 2017/9/29.
 */
public class Solution35 {
    private int count = 0;
    public int InversePairs(int [] array) {
        if(array.length<=1)
            return 0;
        mergeSort(array, 0, array.length-1);
        return count;
    }

    public int[] merge(int[] left, int[] right){
        int[] res = new int[left.length+right.length];
        int p1 = left.length-1;
        int p2 = right.length-1;
        int idx = left.length+right.length-1;
        while(idx>=0){
            if(left[p1]>right[p2]){
                count += (p2+1);
                if(count>=1000000007) count %= 1000000007;
                res[idx--] = left[p1--];
            }
            else
                res[idx--] = right[p2--];
            if(p1<0)
                while(p2>=0) res[idx--] = right[p2--];
            if(p2<0)
                while(p1>=0) res[idx--] = left[p1--];
        }
        return res;
    }

    public int[] mergeSort(int[] arr, int start, int end){
        if(end<=start)
            return new int[]{arr[start]};
        int mid = (start+end)/2;
        int[] left = mergeSort(arr, start, mid);
        int[] right = mergeSort(arr, mid+1, end);
        return merge(left,right);
    }
    public static void main(String[] args) throws Exception{
        Solution35 sl = new Solution35();
        int[] arr = new int[]{1,2,3,4,5,6,7,0};
        System.out.println(sl.InversePairs(arr));
    }
}
