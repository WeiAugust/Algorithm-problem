package 两两交换链表中的节点;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author wzg
 * @Date 2020/9/6 21:11
 * @Version 1.0
 **/
public class Solution {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
    public ListNode swapPairs(ListNode head) {

        ListNode preNode = new ListNode(-1);
        preNode.next = head;
        ListNode res = preNode;
        while (head != null && head.next != null) {
            ListNode nodeA = head;
            ListNode nodeB = head.next;

            preNode.next = nodeB;
            nodeA.next = nodeB.next;
            nodeB.next = nodeA;

            preNode = nodeA;
            head = nodeA.next;
        }
        return res;
    }
}
