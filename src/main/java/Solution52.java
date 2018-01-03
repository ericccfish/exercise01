/**
 * Created by chenjianfeng on 2017/10/1.
 */
public class Solution52 {
    public boolean match(char[] str, char[] pattern, int p1, int p2){
        if(p1==str.length || p2==pattern.length){
            if(p1==str.length && p2==pattern.length)
                return true;
            else if(p1==str.length && p2<pattern.length-1 && pattern[p2+1]=='*')
                return match(str, pattern, p1, p2+2);
            return false;
        }
        if(p2<pattern.length-1 && pattern[p2+1]=='*') {
            if(str[p1]!=pattern[p2] && pattern[p2]!='.')
                return match(str, pattern, p1, p2+2);
            else
                return match(str, pattern, p1, p2 + 2) ||
                        match(str, pattern, p1 + 1, p2 + 2) ||
                        match(str, pattern, p1 + 1, p2);
        }
        else{
            if(str[p1]==pattern[p2] || pattern[p2]=='.')
                return match(str, pattern, p1+1, p2+1);
        }
        return false;
    }
    public boolean match(char[] str, char[] pattern){
        return match(str, pattern, 0, 0);
    }

    public static void main(String[] args) throws Exception{
        Solution52 sl = new Solution52();
        String s1 = "aaa";
        String s2 = "ab*aa";
        char[] str = s1.toCharArray();
        char[] pattern = s2.toCharArray();
        System.out.println(sl.match(str, pattern));
    }
}
