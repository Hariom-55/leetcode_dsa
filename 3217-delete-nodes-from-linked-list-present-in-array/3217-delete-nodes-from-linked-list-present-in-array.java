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
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        HashSet<Integer> num = new HashSet<>();

        for(int n : nums)
        {
            num.add(n);
        }

        ListNode lead = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode follow = dummy;

        while(lead != null)
        {
            while(lead != null && num.contains(lead.val))
            {
                lead = lead.next;
            }

            follow.next = lead;
            
            if(lead != null)
            {
                follow = lead;
                lead= lead.next;
            }

        }

        return dummy.next;
    }
}