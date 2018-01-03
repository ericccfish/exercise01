/**
 * Created by chenjianfeng on 2017/9/16.
 */
public class Solution28 {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array.length==0)
            return 0;
        int cnt = 0;
        int record = 0;
        for(int i=0; i<array.length; i++){
            if(cnt==0){
                record = array[i];
                cnt++;
            }
            else if(record==array[i])
                cnt++;
            else
                cnt--;
        }
        return checkMoreThanHalf(array, record)? record:0;
    }

    public boolean checkMoreThanHalf(int[] arr, int num){
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==num)
                cnt++;
        }
        return cnt*2>arr.length;
    }

    public static void main(String[] args) throws Exception{
        Solution28 sl = new Solution28();
        int[] arr = new int[]{1,2,3,2,2,2,5,4,2};
        System.out.println(sl.MoreThanHalfNum_Solution(arr));
    }
}
