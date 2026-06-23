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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) return null;

        // Step 1: Dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Step 2: Move prev to node before 'left'
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Step 3: Reverse sublist
        ListNode curr = prev.next;
        ListNode next = null;
        ListNode sublistPrev = null;

        for (int i = 0; i <= right - left; i++) {
            next = curr.next;
            curr.next = sublistPrev;
            sublistPrev = curr;
            curr = next;
        }

        // Step 4: Reconnect
        prev.next.next = curr;   // tail of reversed sublist connects to 'curr'
        prev.next = sublistPrev; // prev connects to new head of reversed sublist

        return dummy.next;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna