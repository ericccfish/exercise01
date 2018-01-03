import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by chenjianfeng on 2017/9/29.
 */
public class Solution34 {
    public int FirstNotRepeatingChar(String str) {
        if(str.length()==0)
            return -1;
        int hashtable[] = new int[256];
        for(int i=0; i<str.length(); i++)
            hashtable[(int) str.charAt(i)] ++;
        for(int i=0; i<str.length(); i++){
            if(hashtable[(int) str.charAt(i)]==1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) throws Exception{
        Solution34 sl = new Solution34();
        System.out.println(sl.FirstNotRepeatingChar("abcdeabe"));
    }
}
