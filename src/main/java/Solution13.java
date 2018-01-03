/**
 * Created by chenjianfeng on 2017/9/13.
 */
public class Solution13 {
    public void reOrderArray(int [] array) {
        if(array.length>0){
            int[] res = new int[array.length];
            int oddCounts = 0;
            for(int i=0; i<array.length; i++){
                if(array[i]%2==1)
                    oddCounts++;
            }
            for(int odd=0, even=oddCounts, i=0; i<array.length; i++){
                if(array[i]%2==1)
                    res[odd++] = array[i];
                else
                    res[even++] = array[i];
            }
            for(int i=0; i<array.length; i++){
                array[i] = res[i];
            }
        }
    }

    public static void main(String[] args) throws Exception{
        Solution13 sl = new Solution13();
        int[] arr = new int[]{1,2,3,4,5,5,6,7,8,9};
        sl.reOrderArray(arr);
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+ " ");
    }
}
