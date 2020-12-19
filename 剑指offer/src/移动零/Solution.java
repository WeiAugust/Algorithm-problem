package 移动零;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/9/6 19:19
 * @Version 1.0
 **/
public class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = 0, index = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (index != i) {
                    nums[index] = nums[i] ^ nums[index];
                    nums[i] = nums[i] ^ nums[index];
                    nums[index] = nums[i] ^ nums[index];
                }
                index++;
            }
        }
    }
}
