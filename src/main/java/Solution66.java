/**
 * Created by chenjianfeng on 2017/10/3.
 */
public class Solution66 {
    public int movingCount(int threshold, int rows, int cols){
        boolean[][] visited = new boolean[rows][cols];
        return movingCountCore(threshold,rows,cols,0,0,visited);
    }

    public int movingCountCore(int threshold, int rows, int cols, int i, int j, boolean[][] visited){
        if(i<0 || i>=rows || j<0 || j>=cols || visited[i][j] || !isValid(i,j,threshold))
            return 0;
        visited[i][j] = true;
        return movingCountCore(threshold,rows,cols,i-1,j,visited) +
                movingCountCore(threshold,rows,cols,i+1,j,visited) +
                movingCountCore(threshold,rows,cols,i,j-1,visited) +
                movingCountCore(threshold,rows,cols,i,j+1,visited) + 1;
    }
    public boolean isValid(int i, int j, int threshold){
        int sum = 0;
        while(i%10!=0 || j%10!=0){
            sum += i%10+j%10;
            i /= 10;
            j /= 10;
        }
        return sum<=threshold;
    }

    public static void main(String[] args) throws Exception{
        Solution66 sl = new Solution66();
        System.out.println(sl.movingCount(5,4,5));
    }
}
