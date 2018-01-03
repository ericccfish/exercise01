/**
 * Created by chenjianfeng on 2017/9/13.
 */
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution19 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = new ArrayList();
        if(matrix.length==0)
            return res;
        int row = 0;
        int col = 0;
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        while(2*row<rowSize && 2*col<colSize){
            for(int i=col; i<colSize-col; i++)
                res.add(matrix[row][i]);
            for(int i=row+1; i<rowSize-row; i++)
                res.add(matrix[i][colSize-col-1]);
            for(int i=colSize-col-2; i>=col && rowSize-row-1>row; i--)
                res.add(matrix[rowSize-row-1][i]);
            for(int i=rowSize-row-2; i>row && col<colSize-col-1; i--)
                res.add(matrix[i][col]);
            row++;
            col++;
        }
        return res;
    }

    public static void main(String[] args) throws Exception{
        int x = 5;
        int y = 2;
        int[][] matrix = new int[x][y];
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                matrix[i][j] = i*y+j+1;
                System.out.println(matrix[i][j]);
            }
        }
        Solution19 sl = new Solution19();
        ArrayList result = sl.printMatrix(matrix);
        System.out.println(result.toString());
    }
}
