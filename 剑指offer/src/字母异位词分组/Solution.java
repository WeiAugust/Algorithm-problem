package 字母异位词分组;

import java.util.*;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/9/8 19:47
 * @Version 1.0
 **/
public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List> res = new HashMap<>();
        for (String s : strs) {
            char[] count = new char[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String temp = String.valueOf(count);
            if (!res.containsKey(temp)){
                res.put(temp, new ArrayList());
            }
            res.get(temp).add(s);
        }
        return new ArrayList(res.values());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strings ={"eat","tea","tan","ate","nat","bat"};
        solution.groupAnagrams(strings);
    }
}
