package 加一;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/9/7 11:23
 * @Version 1.0
 **/
public class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >=0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            }else {
                digits[i] += 1;
                break;
            }
        }
        if (digits[0] == 0) {
            int[] res = new int[digits.length+1];
            System.arraycopy(digits, 0, res, 1, digits.length);
            res[0] = 1;
            return res;
        }
        return digits;
    }
}
