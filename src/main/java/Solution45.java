import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by chenjianfeng on 2017/9/30.
 */
public class Solution45 {
    public int[] findMinMaxExceptForZero(int[] numbers){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]<min && numbers[i]!=0)
                min = numbers[i];
            if(numbers[i]>max && numbers[i]!=0)
                max = numbers[i];
        }
        return new int[]{min, max};
    }
    public boolean isRepeatedExceptForZero(int[] numbers){
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i]!=0 && numbers[i]==numbers[j])
                    return true;
            }
        }
        return false;
    }
    public boolean isContinuous(int [] numbers) {
        if(numbers.length!=5 || isRepeatedExceptForZero(numbers))
            return false;
        int[] mm = findMinMaxExceptForZero(numbers);
        return mm[1]-mm[0]<5? true:false;
    }

    public static void main(String[] args) throws Exception{
        int[] arr = new int[]{1,3,0,0,5};
        Solution45 sl = new Solution45();
        System.out.println(sl.isContinuous(arr));
    }
}
