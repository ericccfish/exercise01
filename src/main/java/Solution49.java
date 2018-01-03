/**
 * Created by chenjianfeng on 2017/9/30.
 */
public class Solution49 {
    public int StrToInt(String str) {
        if(str.length()==0)
            return 0;
        int pos = 1;
        int idx = 0;
        if(str.charAt(idx)=='+' || str.charAt(idx)=='-')
            pos = str.charAt(idx++)=='-'? 0:1;
        int res = 0;
        while(idx<str.length()){
            int num = str.charAt(idx)-48;
            if(num>=0 && num<=9)
                res = res*10+num;
            else
                return 0;
            idx++;
        }
        return pos==1? res:-res;
    }

    public static void main(String[] args) throws Exception{
        Solution49 sl = new Solution49();
        System.out.println(sl.StrToInt("+2147483647"));
    }
}
