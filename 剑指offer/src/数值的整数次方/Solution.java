package 数值的整数次方;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/2/21 16:34
 * @Version 1.0
 **/
public class Solution {
    public double myPow(double x, int n) {
        long N = n;//坑点
        if(N < 0){
            x = 1/x;
            N *= -1;
        }
        double result = 1;
        while(N > 0) {
            if((N&1)==1){
                result *= x;
            }
            x *= x;
            N >>>= 1;
        }
        return result;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myPow(2.00000,-2147483648));
    }
}
