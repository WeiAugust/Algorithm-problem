package 盛最多谁的容器;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/9/6 19:19
 * @Version 1.0
 **/
public class Solution {

    public int maxArea(int[] height) {
        int area = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            int temp = (right-left) * Math.min(height[left], height[right]);
            area = Math.max(area, temp);
            if (height[left] <= height[right]) {
                ++left;
            }else {
                --right;
            }
        }
        return area;
    }
}
