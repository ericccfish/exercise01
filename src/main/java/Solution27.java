import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by chenjianfeng on 2017/9/16.
 */
public class Solution27 {
    public ArrayList<String> res = new ArrayList<String>();
    public String swap(String str, int i, int j){
        char[] arr = str.toCharArray();
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        return new String(arr);
    }
    public void perm(String str, int begin){
        if(begin>=str.length()) {
            res.add(str);
            return;
        }
        for(int i=begin; i<str.length(); i++){
            if(i==begin || str.charAt(begin)!=str.charAt(i)) {
                str = swap(str, begin, i);
                perm(str, begin + 1);
                str = swap(str, i, begin);
            }
        }
    }
    public ArrayList<String> Permutation(String str) {
        if(str.length()==0)
            return res;
        perm(str, 0);
        return res;
    }

    public static void main(String[] args) throws Exception{
        Solution27 sl = new Solution27();
        String str = "abc";
        sl.Permutation(str);
        System.out.println(sl.res);
        Collections.sort(sl.res, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(sl.res);
    }
}
