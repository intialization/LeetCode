import org.junit.Test;

import java.util.Arrays;

/**
 * 给定一个非负整数数组和一个整数 m，你需要将这个数组分成 m 个非空的连续子数组。设计一个算法使得这 m 个子数组各自和的最大值最小。
 * 注意:
 * 数组长度 n 满足以下条件:
 * 1 ≤ n ≤ 1000
 * 1 ≤ m ≤ min(50, n)
 */
public class LC410 {
    public int splitArray(int[] nums, int m) {
        int ans =0;
        int count=1;
        long temp=0;
        long flag =0;
        for(int i =0 ;i<nums.length;i++){
            flag+=nums[i];
        }
        flag =flag/m;
        for (int i=0;i< nums.length;i++){
            if(count == m){
                for(int j=i ;j<nums.length;j++){
                    temp+=nums[j];
                }
                return Math.max(ans,(int) temp);
            }else{
                temp=temp+nums[i];
                if(temp>flag){
                    if((i+1<nums.length&&nums[i]+nums[i+1]<temp)||nums[i]<temp){
                        temp = temp-nums[i];
                        i=i-1;
                    }
                    count++;
                    ans=Math.max(ans,(int)temp);
                    temp =0;
                }
            }
        }
        return ans;
    }
    @Test
    public static void main(String[] args) {
        int[] a ={10,5,13,4,8,4,5,11,14,9,16,10,20,8};
        LC410 lc410 = new LC410();
        System.out.println(lc410.splitArray(a, 8));
    }
}
