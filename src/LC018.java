import java.util.*;

class LC018{
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> set = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i<nums.length-3;i++){
            /*if (i>0&&nums[i-1]==nums[i])
                continue;*/
            /*if ((nums[i]+nums[i+1])>target)
                break;*/
            for (int j=i+1;j<nums.length-2;j++){
               /* if (j>i+1&&nums[j-1]==nums[j])
                    continue;*/

                int newTarget = target - nums[i] - nums[j];
                int left = j+1;
                int right = nums.length-1;
                while(left<right){
                    if (nums[left]+nums[right]==newTarget){
                        set.add(Arrays.asList(new Integer[]{nums[i],nums[j],nums[left],nums[right]}));
                        left++;
                        right--;
                    }
                    if (nums[left]+nums[right]<newTarget) {
                        left++;
                        /*while(left<right&&nums[left-1]==nums[left])
                            left++;*/
                    }
                    if (nums[left]+nums[right]>newTarget) {
                        right--;
                       /* while(left<right&&nums[right+1]==nums[right])
                            right--;*/
                    }
                }
            }
        }
        System.out.println(set.size());
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            ans.add((List<Integer>) iterator.next());
        }
        return ans;
    }


    public static void main(String[] args) {
        LC018 s = new LC018();
        int[] test = new int[]{1,-2,-5,-4,-3,3,3,5};
        List<List<Integer>> ff= s.fourSum(test,-11);
        System.out.println(ff);

    }
}

