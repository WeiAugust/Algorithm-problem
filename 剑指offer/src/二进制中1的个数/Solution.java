package 二进制中1的个数;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/2/21 16:16
 * @Version 1.0
 **/
public class Solution {
    public int hammingWeight(int n) {
        int sum = 0;
        while(n != 0){
            sum++;
            n = n&(n-1);
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hammingWeight(8));
    }
}
