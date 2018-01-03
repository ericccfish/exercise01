/**
 * Created by chenjianfeng on 2017/10/1.
 */
public class Solution53 {
    private boolean hasE = false;
    private boolean hasP = false;

    public boolean isDigist(char ch){
        return (ch-48>=0 && ch-48<=9);
    }
    public boolean isNumeric(char[] str, int p){
        if(p==str.length-1)
            return isDigist(str[p]);
        if(str[p]=='+' || str[p]=='-') {
            if(p==0) return isNumeric(str, ++p);
            else return (str[p-1]=='E'||str[p-1]=='e') && isNumeric(str, ++p);
        }
        else if((str[p]=='e' || str[p]=='E') && p!=0 && !hasE) {
            this.hasE = true;
            return isNumeric(str, ++p);
        }
        else if(str[p]=='.' && p!=0 && !hasP && !hasE) {
            this.hasP = true;
            return isNumeric(str, ++p);
        }
        else if(isDigist(str[p]))
            return isNumeric(str, ++p);
        else
            return false;
    }

    public boolean isNumeric(char[] str){
        return isNumeric(str, 0);
    }

    public static void main(String[] args) throws Exception{
        Solution53 sl = new Solution53();
        String str = "+12e34";
        char[] arr = str.toCharArray();
        System.out.println(sl.isNumeric(arr));
    }
}
