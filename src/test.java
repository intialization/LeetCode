import java.util.*;

/**
 * @author 贲阳林
 */
public class test {
    public static void main(String[] args) {
        int[] candies =new int[]{4,2,1,1,2};
        int extraCandies =3;
        LC1431 a= new LC1431();
        var ans=a.kidsWithCandies(candies,extraCandies);
        for (Boolean an : ans) {
            System.out.println(an);
        }
    }
}
