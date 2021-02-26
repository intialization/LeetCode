import org.junit.Test;

import java.util.LinkedList;
import java.util.List;


/**
 * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 * 相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。
 * 例如，给定三角形：
 * [
 *      [2],
 *     [3,4],
 *    [6,5,7],
 *   [4,1,8,3]
 * ]
 */

public class LC120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i =triangle.size()-2;i>-1;i--){//从倒数第二层开始遍历
            for(int j =0;j< triangle.get(i).size();j++){//遍历该层的每一个节点
                triangle.get(i).set(j,Math.min(triangle.get(i).get(j) + triangle.get(i + 1).get(j),triangle.get(i).get(j) + triangle.get(i + 1).get(j+1)));
            }
        }
        return triangle.get(0).get(0);
    }

    @Test
    public void test(){
        List<List<Integer>> triangle =new LinkedList<List<Integer>>();
        List<Integer> l1=new LinkedList<>();
        l1.add(2);
        List<Integer> l2=new LinkedList<>();
        l2.add(3);
        l2.add(4);
        List<Integer> l3=new LinkedList<>();
        l3.add(6);
        l3.add(5);
        l3.add(7);
        List<Integer> l4=new LinkedList<>();
        l4.add(4);
        l4.add(1);
        l4.add(8);
        l4.add(3);
        triangle.add(l1);
        triangle.add(l2);
        triangle.add(l3);
        triangle.add(l4);
        System.out.println(new LC120().minimumTotal(triangle));
    }
}
