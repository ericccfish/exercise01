/**
 * Created by chenjianfeng on 2017/10/1.
 */
public class Solution50 {
    public boolean duplicate(int[] numbers, int length, int[] duplication){
        if(length==0)
            return false;
        int[] temp = new int[length];
        for(int i=0; i<length; i++)
            temp[i] = 0;
        for(int i=0; i<length; i++){
            if(temp[numbers[i]]==0)
                temp[numbers[i]] = 1;
            else{
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception{
        int[] arr = new int[]{2,3,1,0,6,5,3};
        Solution50 sl = new Solution50();
        int[] duplication = new int[arr.length];
        System.out.println(sl.duplicate(arr, arr.length, duplication));
    }
}
