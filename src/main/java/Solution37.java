/**
 * Created by chenjianfeng on 2017/9/30.
 */
public class Solution37 {
    public int GetNumberOfK(int [] array , int k) {
        if(array.length==0)
            return 0;
        int idx = binSearch(array, 0, array.length-1, k);
        int count = 0;
        for(int p=idx; p>=0 && array[p]==k; p--)
            count++;
        for(int p=idx+1; p<array.length && array[p]==k; p++)
            count++;
        return count;
    }

    public int binSearch(int[] arr, int left, int right, int k){
        if(left<=right) {
            int mid = (left+right)/2;
            if(arr[mid]==k)
                return mid;
            else if(arr[mid]<k)
                return binSearch(arr, mid+1, right, k);
            else
                return binSearch(arr, left, mid-1, k);
        }
        return -1;
    }

    public static void main(String[] args) throws Exception{
        int[] arr = new int[]{1,3,4,5,5,5,7,7,8,9};
        Solution37 sl = new Solution37();
        System.out.println(sl.GetNumberOfK(arr, 5));
    }
}
