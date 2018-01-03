import java.util.*;

/**
 * Created by chenjianfeng on 2017/10/1.
 */
class CharNode{
    char val;
    CharNode next;
    CharNode(char x){this.val = x;}

    public static CharNode addNode(CharNode pHead, char ch){
        if(pHead==null)
            return new CharNode(ch);
        CharNode pNode = pHead;
        while(pNode.next!=null)
            pNode = pNode.next;
        pNode.next = new CharNode(ch);
        return pHead;
    }
    public static CharNode removeNode(CharNode pHead, char ch){
        if(pHead==null)
            return null;
        if(pHead.val==ch)
            return pHead.next;
        CharNode pPrev = pHead;
        CharNode pNode = pPrev.next;
        while(pNode!=null){
            if(pNode.val==ch){
                pPrev.next = pNode.next;
                break;
            }
            pPrev = pNode;
            pNode = pNode.next;
        }
        return pHead;
    }
}
public class Solution54 {
    private StringBuffer sb = new StringBuffer();
    private int[] appear = new int[256];
    private CharNode pHead = null;
    public void Insert(char ch){
        if(this.appear[(int)ch]!=1) {
            this.appear[(int)ch] = 1;
            this.pHead = CharNode.addNode(pHead, ch);
        }
        else {
            this.pHead = CharNode.removeNode(pHead, ch);
        }
        this.sb.append(ch);
    }

    public char FirstAppearingOnce(){
        if(pHead==null)
            return '#';
        return this.pHead.val;
    }

    public static void main(String[] args) throws Exception{
        Solution54 sl = new Solution54();
        String str = "google!!";
        for(int i=0; i<str.length(); i++) {
            sl.Insert(str.charAt(i));
            System.out.println(sl.FirstAppearingOnce());
        }
        System.out.println(sl.sb.toString());
    }
}
