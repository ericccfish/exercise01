/**
 * Created by chenjianfeng on 2017/9/12.
 */
public class Solution02 {
    public String replaceSpace(StringBuffer str) {
        if(str.length()==0)
            return str.toString();
        int oldLen = str.length();
        int counts = 0;
        for(int i=0; i<oldLen; i++){
            if(str.charAt(i) == ' '){
                counts++;
            }
        }
        str.setLength(oldLen + 2*counts);
        int i = oldLen-1;
        int j = str.length()-1;
        while(i>=0){
            char ch = str.charAt(i--);
            if(ch != ' '){
                str.setCharAt(j--, ch);
            }
            else{
                str.setCharAt(j--, '0');
                str.setCharAt(j--, '2');
                str.setCharAt(j--, '%');
            }
        }
        return str.toString();
    }

    public static void main(String[] args) throws Exception{
        Solution02 sl = new Solution02();
        System.out.println(sl.replaceSpace(new StringBuffer("We Are Happy.")));
    }
}
