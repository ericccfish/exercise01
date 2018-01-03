import java.util.Scanner;

/**
 * Created by chenjianfeng on 2017/9/13.
 */
public class Solution10 {
    public int RectCover(int target) {
        if(target==0) return 0;
        int[] f = new int[target+1];
        f[0] = 1;
        f[1] = 1;
        for(int i=2; i<=target; i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[target];
    }

    public static void main(String[] args) throws Exception{
        Solution10 sl = new Solution10();
        System.out.println(sl.RectCover(10));

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);

        while(sc.hasNextLine()){
            String strs  =sc.nextLine();
            System.out.println(strs);
        }
    }
}
