import java.awt.event.MouseAdapter;

/**
 * @author 贲阳林
 */
public class LeetCode343 {
    /**
     *给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。
     * @param n
     * @return
     */
    public int integerBreak(int n) {
        if(n==3){
            return 2;
        }
        if(n==2){
            return 1;
        }
        int x =n%3;
        int y =n/3;
        if(x==1){
            return (int) (4*Math.pow(3,y-1));
        }
        if (x==2){
            return (int)(2*Math.pow(3,y));
        }
        return (int)(Math.pow(3,y));
    }
}
