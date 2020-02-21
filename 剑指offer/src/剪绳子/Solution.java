package 剪绳子;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/2/21 13:16
 * @Version 1.0
 **/
public class Solution {

    public int cuttingRope(int n) {
        if(n <= 3) {
            return n - 1;
        }
        int r = n % 3;
        long result = 1l;

        for(int i = 0; i < n / 3 - 1; i++) {
            result = (result * 3) % 1000000007;
        }

        if(r == 0) {
            result = (result * 3) % 1000000007;
        } else if(r == 1) {
            result =  (result * 4) % 1000000007;
        } else if(r == 2) {
            result = (result * 6) % 1000000007;
        }
        return (int)result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.cuttingRope(127));
//        BigInteger a = BigInteger.valueOf(3);
//        System.out.println(a.modPow(BigInteger.valueOf(3),BigInteger.valueOf(10)));
//        System.out.println(solution.pow(3,4));
    }
}
