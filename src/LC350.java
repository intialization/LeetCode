import org.junit.Test;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LC350 {
    /**
     * 给定两个数组，编写一个函数来计算它们的交集。

     * 示例 1：
     * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
     * 输出：[2,2]
     * 示例 2:
     * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * 输出：[4,9]
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        Map map1 =new HashMap<Integer,Integer>();
        Map map2 =new HashMap<Integer,Integer>();
        LinkedList linkedList =new LinkedList<Integer>();

        for (int nums  : nums1) {
                map1.putIfAbsent(nums,0);
                map1.put(nums,(int)map1.get(nums)+1);
        }
        for (int nums  : nums2) {
            map2.putIfAbsent(nums,0);
            map2.put(nums,(int)map2.get(nums)+1);
        }
        for( Object key : map1.keySet()){
            if(map2.get(key)!= null){
                for(int  i=0;i<Math.min((int)map1.get(key),(int)map2.get(key));i++){
                    linkedList.add((Integer) key);
                }
            }
        }
        Integer[] temp =new Integer[linkedList.size()];
        int[] ans =new int[linkedList.size()];
        linkedList.toArray(temp);
        for (int i =0;i<linkedList.size();i++){
            ans[i]=temp[i].intValue();
        }
        return ans;
    }
    @Test
    public void test(){
        int []nums1={1,2,2,1,3,3,4};
        int []nums2={2,2,1,4,7};
        int[] intersect = new LC350().intersect(nums1, nums2);
        for (int i : intersect) {
            System.out.println(i);
        }
    }
}
