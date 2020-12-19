package 有效的括号;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/9/7 18:31
 * @Version 1.0
 **/
public class Solution {
    public boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        }
        if (s.length()%2 != 0) {
            return false;
        }
        Deque<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()){
                stack.push(c);
                continue;
            }
            if ((c == ')' && stack.peek()=='(') ||
                    (c == ']' && stack.peek() =='[')||
                    (c == '}' && stack.peek() == '{')){
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("()"));
    }
}
