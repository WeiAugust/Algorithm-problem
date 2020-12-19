package 删除数组中的重复项;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/9/7 8:33
 * @Version 1.0
 **/
public class Solution {
    public int removeDuplicates(int[] nums) {
       if (nums.length == 0){
           return 0;
       }
       int i = 0;
       for (int j = 1; j < nums.length; j++) {
           if (nums[i] != nums[j]) {
               nums[++i] = nums[j];
           }
       }
       return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(nums));
    }
}
