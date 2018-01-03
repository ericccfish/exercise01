/**
 * Created by chenjianfeng on 2017/9/30.
 */
public class Solution43 {
    public String LeftRotateString(String str, int n) {
        if(str.length()==0)
            return str;
        StringBuffer sb = new StringBuffer();
        sb.append(str.substring(n%str.length(), str.length()));
        for(int i=0; i<n%str.length(); i++)
            sb.append(str.charAt(i));
        return sb.toString();
    }

    public static void main(String[] args) throws Exception{
        Solution43 sl = new Solution43();
        String str = "abcXYZdef";
        System.out.println(sl.LeftRotateString(str, 11));
    }
}
