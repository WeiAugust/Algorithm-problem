package 爬楼梯;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/9/6 19:53
 * @Version 1.0
 **/
public class Solution {
    public int climbStairs(int n) {
        if (n < 4){
            return n;
        }
        int a = 2, b = 3;
        for (int i = 3; i < n; i++) {
            a = a + b;
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
        }
        return b;
    }
}
