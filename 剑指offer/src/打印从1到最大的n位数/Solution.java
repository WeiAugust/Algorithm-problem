package 打印从1到最大的n位数;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/2/21 16:55
 * @Version 1.0
 **/
public class Solution {
    public int[] printNumbers(int n) {
        int max = (int) Math.pow(10, n);
        int[] result = new int[max-1];
        for (int i = 1; i < max; i++){
            result[i-1] = i;
        }
        return result;
    }
}
