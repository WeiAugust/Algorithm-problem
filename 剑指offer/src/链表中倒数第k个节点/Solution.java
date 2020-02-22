package 链表中倒数第k个节点;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/2/22 19:08
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
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(head == null || k < 1){
            return null;
        }
        ListNode target, flag = head;
        while(k>0){
            flag = flag.next;
            k--;
        }
        target = head;
        while(flag!=null){
            flag = flag.next;
            target = target.next;
        }
        return target;
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
        System.out.println(solution.getKthFromEnd(a, 2).val);
    }
}
