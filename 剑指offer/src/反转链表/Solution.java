package 反转链表;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/2/22 19:19
 * @Version 1.0
 **/
public class Solution {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
    public ListNode reverseList(ListNode head) {
        ListNode end = null;
        if (head != null) {
            end = new ListNode(head.val);
            end.next = null;
            while (head.next != null) {
                ListNode tmp = new ListNode(head.next.val);
                tmp.next = end;
                end = tmp;
                head = head.next;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(solution.reverseList(a));
    }
}
