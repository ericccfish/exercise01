/**
 * Created by chenjianfeng on 2017/10/3.
 */
public class Solution65 {
//    (i,j) = i*cols+j
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
        if(matrix.length!=rows*cols || str.length==0)
            return false;
        boolean[][] visited = new boolean[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++)
                visited[i][j] = false;
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(findPath(matrix, rows, cols, str, i, j, 0, visited))
                    return true;
            }
        }
        return false;
    }

    public boolean findPath(char[] matrix, int rows, int cols, char[] str, int i, int j, int p, boolean[][] visited){
        if(p==str.length)
            return true;
        if(i<0 || i>=rows || j<0 || j>=cols)
            return false;
        if(matrix[i*cols+j]!=str[p] || visited[i][j])
            return false;
        visited[i][j] = true;
        boolean isFound =  findPath(matrix, rows, cols, str, i-1, j, p+1, visited) ||
                            findPath(matrix, rows, cols, str, i+1, j, p+1, visited) ||
                            findPath(matrix, rows, cols, str, i, j-1, p+1, visited) ||
                            findPath(matrix, rows, cols, str, i, j+1, p+1, visited);
        if(isFound) return true;
        visited[i][j] = false;
        return false;
    }

    public static void main(String[] args) throws Exception{
        String str = "abcesfcsadee";
        char[] matrix = new char[str.length()];
        for(int i=0; i<str.length(); i++)
            matrix[i] = str.charAt(i);
        Solution65 sl = new Solution65();
        char[] path = new char[]{'a','b','c','c','e','d'};
        System.out.println(sl.hasPath(matrix,3,4, path));
    }
}
