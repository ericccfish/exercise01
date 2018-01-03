/**
 * Created by chenjianfeng on 2017/9/30.
 */
public class Solution44 {
    public void reverseArr(char[] arr, int left, int right){
        if(arr.length==0)
            return;
        while(left<right){
            char tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            right--;
            left++;
        }
        return;
    }
    public String ReverseSentence(String str) {
        if(str.length()==0)
            return str;
        char[] arr = str.toCharArray();
        reverseArr(arr,0, arr.length-1);
        int left = 0;
        int right = left;
        while(right<=arr.length){
            if(right==arr.length || arr[right]==' '){
                reverseArr(arr, left, right-1);
                right++;
                left = right;
            }
            else{
                right++;
            }
        }
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception{
        Solution44 sl = new Solution44();
        System.out.println(sl.ReverseSentence("coder. a am I"));
    }
}
