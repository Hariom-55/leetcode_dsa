/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        
        if(head == null || head.next == null)
        {
            return null;
        }
        ListNode lag = new ListNode(0); // will be used to point the node previous of middle
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            lag = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // now slow is the node to delete and lag is node previous ogf slow

        lag.next = slow.next;

        return head;
    }
}