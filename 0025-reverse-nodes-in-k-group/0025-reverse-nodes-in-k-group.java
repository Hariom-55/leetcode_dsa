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
    private ListNode reverseKNodes(ListNode head, int k)
    {
        ListNode curr = head;
        ListNode prev = null;

        while(k > 0)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr= temp;
            
            k--;
        }

        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        ListNode curr = head;
        ListNode ktail = null;
        ListNode newHead = null;

        while(curr != null)
        {
            int count = 0;
            ListNode checkNode = curr;

            while(count < k && checkNode != null)
            {
                checkNode = checkNode.next;
                count++;
            }

            if(count == k)
            {
                ListNode revHead = reverseKNodes(curr, k);

                if(newHead == null)
                {
                    newHead = revHead;
                }
                if(ktail != null)
                {
                    ktail.next = revHead;
                }

                ktail = curr;
                curr = checkNode;
            }else{
                if(ktail != null)
                {
                    ktail.next = curr;
                }

                break;
            }
        }

        return newHead == null ? head : newHead;
        
    }
}