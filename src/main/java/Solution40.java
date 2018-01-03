/**
 * Created by chenjianfeng on 2017/9/30.
 */
public class Solution40 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array.length>1){
            int bits = 0;
            for(int i=0; i<array.length; i++)
                bits ^= array[i];
            int idx = 1;
            while((bits&idx)==0){
                idx = idx<<1;
            }
            int tmp1=0, tmp2=0;
            for(int i=0; i<array.length; i++){
                if((array[i]&idx)!=0)
                    tmp1 ^= array[i];
                else
                    tmp2 ^= array[i];
            }
            num1[0] = tmp1;
            num2[0] = tmp2;
        }
    }

    public static void main(String[] args) throws Exception{
        int[] arr = new int[]{1,1,2,3,3,4,5,6,5,4};
        Solution40 sl = new Solution40();
        int[] num1 = new int[1];
        int[] num2 = new int[2];
        sl.FindNumsAppearOnce(arr, num1, num2);
        System.out.println(num1[0]+" "+num2[0]);
    }
}
