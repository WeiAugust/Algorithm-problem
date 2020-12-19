package 柱状图中的最大矩形;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/9/7 21:05
 * @Version 1.0
 **/
public class Solution {

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        if (n == 0) {
            return 0;
        }
        if (n ==1) {
            return heights[0];
        }
        int area = 0;
        int[] newHeights = new int[n+2];
        for (int i= 0;i < n; i++) {
            newHeights[i+1] = heights[i];
        }
        n+=2;
        heights = newHeights;
        Deque<Integer> stack = new ArrayDeque<>();
        stack.addLast(0);
        for (int i = 0;i < n; i++) {
            while (heights[stack.peekLast()] > heights[i]) {
                int height = heights[stack.removeLast()];
                int width = i - stack.peekLast() - 1;
                area = Math.max(area, width*height);
            }
            stack.addLast(i);
        }
        return area;
    }
}
