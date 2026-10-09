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
    public ListNode removeElements(ListNode head, int val) {
        ListNode lead = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode follow = dummy;
        
        while(lead != null)
        {
            if(lead.val == val)
            {
                follow.next = lead.next;
                lead = lead.next;
        
            }
            else {
                follow = lead;
                lead = lead.next;
            }
        
            
        }

        return dummy.next;
    }
}