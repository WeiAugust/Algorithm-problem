package 有效的字母异位词;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/9/8 19:41
 * @Version 1.0
 **/
public class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] cache = new int[26];
        for (char c : s.toCharArray()) {
            cache[c-'a']++;
        }
        for (char c : t.toCharArray()) {
            cache[c-'a']--;
            if (cache[c-'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
