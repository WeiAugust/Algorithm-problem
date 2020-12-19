package 旋转数组;
/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/9/7 8:53
 * @Version 1.0
 **/
public class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length > 0){
            k = k%nums.length;
            k = nums.length-k;
            rotate(nums, 0, k-1);
            rotate(nums,k, nums.length-1);
            rotate(nums, 0, nums.length-1);

            /**
             * k %= nums.length;
             * reverse(nums, 0, nums.length - 1);
             * reverse(nums, 0, k - 1);
             * reverse(nums, k, nums.length - 1);
             */

        }
    }

    private void rotate(int[] nums, int start, int end){
        while (start < end) {
            nums[start] = nums[start] ^ nums[end];
            nums[end] = nums[start] ^ nums[end];
            nums[start] = nums[start] ^ nums[end];
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        Solution solution = new Solution();
        solution.rotate(nums, 3);
        System.out.println("1");
    }
}
