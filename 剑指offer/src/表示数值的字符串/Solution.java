package 表示数值的字符串;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/2/22 18:44
 * @Version 1.0
 **/
public class Solution {
    public boolean isNumber(String s) {
        int end = s.length();
        char c = s.charAt(end-1);
        if(c < 48 || c >57){
            return false;
        }
        try {
            Double d = Double.parseDouble(s);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isNumber("1"));
//        System.out.println(solution.isNumber("5e2"));
//        System.out.println(solution.isNumber("3.14"));
//        System.out.println(solution.isNumber("0123"));
//        System.out.println(solution.isNumber("-1E-16"));
    }
}
