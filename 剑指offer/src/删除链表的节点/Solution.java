package 删除链表的节点;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/2/22 14:45
 * @Version 1.0
 **/
public class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public ListNode deleteNode(ListNode head, int val) {
        if(head == null){
            return null;
        }
        if (head.val == val) {
            return head.next;
        }
        ListNode p = head;
        while(p.next != null){
            if(p.next.val == val){
                p.next = p.next.next;
                return head;
            }
            p = p.next;
        }
      return null;
    }
}
