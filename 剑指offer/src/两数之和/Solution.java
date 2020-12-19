package 两数之和;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/9/7 11:14
 * @Version 1.0
 **/
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> cache = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (cache.containsKey(complement)) {
                return new int[]{cache.get(complement), i};
            }
            cache.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
