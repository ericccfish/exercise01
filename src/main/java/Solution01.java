/**
 * Created by chenjianfeng on 2017/9/12.
 */
public class Solution01 {
    public boolean Find(int target, int [][] array) {
        int col = array[0].length-1;
        int row = 0;
        while(row<array.length && col>=0){
            if(array[row][col]==target)
                return true;
            else if(array[row][col]>target)
                col --;
            else
                row ++;
        }
        return false;
    }

    public static void main(String[] args) throws Exception{
        int[][] array = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        Solution01 sl = new Solution01();
        System.out.println(sl.Find(7, array));
    }
}
