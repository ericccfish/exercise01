/**
 * Created by chenjianfeng on 2017/10/1.
 */
public class Solution51 {
    public int[] multiply(int[] A){
        if(A.length==0)
            return A;
        int[] B = new int[A.length];
        B[0] = 1;
        for(int i=1; i<A.length; i++){
            B[i] = B[i-1]*A[i-1];
        }
        for(int i=A.length-2, back=1; i>=0; i--){
            back *= A[i+1];
            B[i] = B[i]*back;
        }
        return B;
    }

    public static void main(String[] args) throws Exception{
        int[] A = new int[]{1,2,3,4,5,6,7,8};
        Solution51 sl = new Solution51();
        int[] B = sl.multiply(A);
        for(int i=0; i<B.length; i++)
            System.out.print(B[i]+" ");
    }
}
