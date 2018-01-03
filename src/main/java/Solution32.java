import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by chenjianfeng on 2017/9/29.
 */
public class Solution32 {
    public String PrintMinNumber(int [] numbers) {
        if(numbers.length==0)
            return "";
        String[] arr = new String[numbers.length];
        for(int i=0; i<numbers.length; i++)
            arr[i] = String.valueOf(numbers[i]);
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String o1, String o2) {
                String ab = o1+o2;
                String ba = o2+o1;
                return ab.compareTo(ba);
            }
        });
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<arr.length; i++)
            sb.append(arr[i]);
        return sb.toString();
    }

    public static void main(String[] args) throws Exception{
        Solution32 sl = new Solution32();
        int[] nums = new int[]{3,32,321,4,11};
        System.out.println(sl.PrintMinNumber(nums));
    }
}
