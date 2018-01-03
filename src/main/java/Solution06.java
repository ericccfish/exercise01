/**
 * Created by chenjianfeng on 2017/9/12.
 */
public class Solution06 {
    public static int minNumberInRotateArray(int [] array) {
        if(array.length==0)
            return 0;
        int left = 0;
        int right = array.length-1;
        while((right-left)>1){
            int mid = (right+left)/2;
            if(array[mid]>=array[left]){
                left = mid;
            }
            if(array[mid]<=array[right]){
                right = mid;
            }
        }
        return array[left]<array[right]? array[left]:array[right];
    }

    public static void main(String[] args) throws Exception{
        int [] arr = {3,4,5,1,2};
        System.out.println(minNumberInRotateArray(arr));
    }
}
