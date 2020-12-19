package 左旋字符串;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/11/18 15:31
 * @Version 1.0
 **/

/**
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
 * 请定义一个函数实现字符串左旋转操作的功能。
 * 比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 */
public class Solution {

    public String reverseLeftWords(String s, int n) {
        if (n >= 1 && n < s.length()) {
            return s.substring(n) + s.substring(0, n);
        }
        return null;
    }
}
