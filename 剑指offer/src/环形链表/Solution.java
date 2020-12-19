package 环形链表;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/9/6 22:49
 * @Version 1.0
 **/
public class Solution {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<>();
        while (head != null) {
            if (nodeSet.contains(head)) {
                return true;
            }
            else {
                nodeSet.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
