package 把数组排成最小的数;

import java.util.Arrays;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/11/18 15:40
 * @Version 1.0
 **/
public class Solution {

    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, (x, y) -> (x+y).compareTo(y+x));
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s);
        }
        return res.toString();
    }
}
