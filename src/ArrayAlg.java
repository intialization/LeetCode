import javax.swing.*;

/**
 * @author 贲阳林
 */
public class ArrayAlg {
    public static <T>  T getMiddle(T...a){
        return a[a.length/2];
    }

    public static void main(String[] args) {
        var middle = ArrayAlg.getMiddle("3.14",1726,null);
        System.out.println(middle);
    }
}
