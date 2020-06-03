import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 贲阳林
 */
public class LC1431 {
    /**
     * 给你一个数组 candies 和一个整数 extraCandies ，其中 candies[i] 代表第 i 个孩子拥有的糖果数目。
     * 对每一个孩子，检查是否存在一种方案，将额外的extraCandies个糖果分配给孩子们之后，此孩子有最多的糖果。
     * 注意，允许有多个孩子同时拥有最多的糖果数目。
     * @param candies
     * @param extraCandies
     * @return
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans =new ArrayList<>();
        int Max = 0;
        for (var can :candies) {
            Max=(can>Max?can:Max);
        }
        for(int i=0;i<candies.length;i++){
            if (candies[i]+extraCandies-Max>=0){
                ans.add(true);
            }
            else {
                ans.add(false);
            }
        }
        return ans;
    }
}
