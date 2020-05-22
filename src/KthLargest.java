import java.util.Arrays;
import java.util.Collections;

/**
 * @author 贲阳林
 */
public class KthLargest {
        private  int k;
        private  int[] nums;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.nums=nums;
    }
    /**
     * 设计一个找到数据流中第K大元素的类（class）。注意是排序后的第K大元素，不是第K个不同的元素。
     * 你的KthLargest类需要一个同时接收整数k和整数数组nums的构造器，它包含数据流中的初始元素。每次调用KthLargest.add，返回当前数据流中第K大的元素。
     * @param val
     * @return 第K大的值
     */
    public int add(int val) {
        int[] temp = Arrays.copyOf(this.nums,this.nums.length+1);
        temp[temp.length-1]=val;
        Arrays.sort(temp);
        this.nums=temp;
        System.out.println(nums[nums.length-k]);
        return nums[nums.length-k];
    }
}
