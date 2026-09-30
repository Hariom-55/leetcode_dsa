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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode back = head;
        ListNode front = head.next;

        while(front != null)
        {
            if(back.val == front.val)
            {
                back.next = front.next;
                front = front.next;
            }else {
                back = back.next;
                front = front.next;
            }

            
        }

        return head;
    }
}