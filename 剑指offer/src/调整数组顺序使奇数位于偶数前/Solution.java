package 调整数组顺序使奇数位于偶数前;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/2/22 19:04
 * @Version 1.0
 **/
public class Solution {
    public int[] exchange(int[] nums) {
        int length = nums.length;
        int start = 0, end = length-1;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            if(nums[i]%2 == 0) {
                result[end--] = nums[i];
            }else{
                result[start++] = nums[i];
            }
        }
        return result;
    }


}
