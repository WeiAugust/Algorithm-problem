package 机器人运动范围;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/2/21 10:05
 * @Version 1.0
 **/

import java.util.LinkedList;

/**
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，
 * 它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。
 * 请问该机器人能够到达多少个格子？
 *
 */
public class Solution {
    public int movingCount(int m, int n, int k){
        boolean[][] marked = new boolean[m][n];
        int result = 1;
        LinkedList<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        while(!queue.isEmpty()){
            int[] tmp = queue.poll();
            int x = tmp[0];
            int y = tmp[1];
            int newX = x + 1;
            int newY = y + 1;
            if(newX >= 0 && newX < m && isValid(newX, y, k) && !marked[newX][y]){
                queue.add(new int[]{newX,y});
                marked[newX][y] = true;
                result++;
            }
            if(newY >= 0 && newY < n && isValid(x, newY, k) && !marked[x][newY]){
                queue.add(new int[]{x,newY});
                marked[x][newY] = true;
                result++;
            }
        }
        return result;
    }
    //计算数位之和
    private int sum(int n){
        int sum = 0;
        while(n > 0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
    //判断是否满足行坐标和列坐标的数位之和大于k
    private boolean isValid(int x, int y, int k){
        return sum(x) + sum(y) <= k;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.movingCount(3, 2, 17));
    }
}
