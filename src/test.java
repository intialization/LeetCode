import java.util.*;

/**
 * @author 贲阳林
 */
public class test {
    public static void main(String[] args) {
        String a = "apple apple";
        String b = "banana";
        LC884 lc884 = new LC884();
        String[] strings = lc884.uncommonFromSentences(a, b);
        for (String string : strings) {
            System.out.println(string);
        }
    }

}
