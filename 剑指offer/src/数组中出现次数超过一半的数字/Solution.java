package 数组中出现次数超过一半的数字;

import java.util.Arrays;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/11/19 22:23
 * @Version 1.0
 **/
public class Solution {
    public int majorityElement(int[] nums) {
        int x = 0, votes = 0;
        for (int num : nums) {
            if (votes == 0) {
                x = num;
            }
            votes += num == x ? 1 : -1;
        }
        return x;
    }

//    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length/2];
//    }
}
