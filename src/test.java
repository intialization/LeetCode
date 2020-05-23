import java.util.Arrays;
import java.util.List;

/**
 * @author 贲阳林
 */
public class test {
    public static void main(String[] args) {
        int[] a =new int[]{0,0,0,1,1,0,1,0};
        int N = 574;
        LC957 lc957 = new LC957();
        var ans = lc957.prisonAfterNDays(a,N);
        for (int an : ans) {
            System.out.print(an+"    ");
        }
    }
}
