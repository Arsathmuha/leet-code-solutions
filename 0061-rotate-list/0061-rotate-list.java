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

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // find length and tail
        int length = 1;

        ListNode tail = head;

        while (tail.next != null) {

            tail = tail.next;

            length++;
        }

        // effective rotations
        k = k % length;

        // no rotation needed
        if (k == 0) {
            return head;
        }

        // make circular list
        tail.next = head;

        // find new tail
        int stepsToNewTail = length - k - 1;

        ListNode newTail = head;

        for (int i = 0; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        // new head
        ListNode newHead = newTail.next;

        // break circle
        newTail.next = null;

        return newHead;
    }
}