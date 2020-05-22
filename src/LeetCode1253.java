import java.util.ArrayList;
import java.util.List;

/**
 * @author 贲阳林
 */
public class LeetCode1253 {
    /**
     * 给你一个 2 行 n 列的二进制数组：
     * 矩阵是一个二进制矩阵，这意味着矩阵中的每个元素不是 0 就是 1。
     * 第 0 行的元素之和为 upper。 第 1 行的元素之和为 lower。
     * 第 i 列（从 0 开始编号）的元素之和为 colsum[i]，colsum 是一个长度为 n 的整数数组。
     * 你需要利用 upper，lower 和 colsum 来重构这个矩阵，并以二维整数数组的形式返回它。
     * 如果有多个不同的答案，那么任意一个都可以通过本题。
     * 如果不存在符合要求的答案，就请返回一个空的二维数组。
     * @param upper 第 0 行的元素之和为。
     * @param lower 第 1 行的元素之和为。
     * @param  colsum 第 i 列（从 0 开始编号）的元素之和          
     * @return reconstructMatrix
     */
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        List<List<Integer>> lit =new ArrayList<>();
        int sum =0;
        int count2=0;
        for (int i : colsum) {
            sum+=i;
            if(i==2){
                count2++;
            }
        }
        if(sum!=(upper+lower)||upper<count2||lower<count2){
            return lit;
        }
        List<Integer> up = new ArrayList<>();
        List<Integer> low= new ArrayList<>();
        for (int i=0;i<colsum.length;i++){
            if(colsum[i]==2){
                up.add(1);
            }
            if (colsum[i]==0){
                up.add(0);
            }
            if (colsum[i]==1){
                if(count2<upper){
                    up.add(1);
                    count2++;
                }
                else {
                    up.add(0);
                }
            }
            low.add(colsum[i]-up.get(i));
        }
        lit.add(up);
        lit.add(low);
        return lit;
    }
}
