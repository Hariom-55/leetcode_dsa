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
        
        if(head == null || head.next == null){
            return head;
        }

        ListNode dummy = new ListNode(0, head);
        ListNode back = dummy;
        ListNode front = head;

        while(front != null)
        {
            boolean hasDuplicate = false;

            while(front.next != null && front.val == front.next.val)
            {
                front = front.next;
                hasDuplicate = true;
            }

            if(hasDuplicate)
            {
                back.next = front.next;
            }else{
                back = back.next;
            }

            front = front.next;
        }

        return dummy.next;

    }
}