import java.util.ArrayList;

/**
 * Created by chenjianfeng on 2017/9/30.
 */
public class Solution41 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        if(sum<=0)
            return new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        int left = 1;
        int right = left;
        int curSum = left;
        while(left<(sum+1)/2 && right<sum){
            if(curSum<sum) {
                right++;
                curSum += right;
            }
            else if(curSum>sum){
                curSum -= left;
                left++;
            }
            else{
                ArrayList<Integer> ans = new ArrayList<Integer>();
                for(int i=left; i<=right; i++)
                    ans.add(i);
                res.add(ans);
                right++;
                curSum += right;
            }
        }
        return res;
    }

    public static void main(String[] args) throws Exception{
        Solution41 sl = new Solution41();
        ArrayList<ArrayList<Integer>> res = sl.FindContinuousSequence(100);
        for(ArrayList<Integer>r: res){
            for(int i=0; i<r.size(); i++)
                System.out.print(r.get(i)+" ");
            System.out.println();
        }
    }
}
