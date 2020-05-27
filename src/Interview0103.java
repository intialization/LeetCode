import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 贲阳林
 */
public class Interview0103 {
    public String replaceSpaces(String S, int length) {
        char[] chars = S.toCharArray();
        StringBuilder ans =new StringBuilder();
        for (int i =0 ;i<length ; i++) {
                if( ' '==chars[i]){
                    ans.append('%');
                    ans.append('2');
                    ans.append('0');
                }
                else {
                    ans.append(chars[i]);
                }
            }
        return ans.toString();
    }
}
