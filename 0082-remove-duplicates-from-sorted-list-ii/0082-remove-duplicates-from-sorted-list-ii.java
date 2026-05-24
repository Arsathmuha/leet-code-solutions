/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0);

        dummy.next = head;

        ListNode prev = dummy;

        ListNode current = head;

        while (current != null) {

            // duplicate sequence found
            if (current.next != null &&
                current.val == current.next.val) {

                int duplicateValue = current.val;

                // skip all duplicates
                while (current != null &&
                       current.val == duplicateValue) {

                    current = current.next;
                }

                prev.next = current;
            }

            // unique node
            else {

                prev = prev.next;

                current = current.next;
            }
        }

        return dummy.next;
    }
}