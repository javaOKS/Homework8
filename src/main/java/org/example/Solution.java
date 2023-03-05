package org.example;
public class Solution {
    public class ListNode {
        private int val;
        private ListNode next;

        public ListNode() {
            this.val = 0;
            this.next = null;
        }

        public ListNode(int val) {
            this.val = val;

        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public ListNode reverseList(ListNode head) {
        ListNode pointer = head;
        ListNode current = null;
        ListNode prev = null;

        while (pointer != null) {
            current = pointer;
            pointer = pointer.next;
            current.next = prev;
            prev = current;
            head = current;

        }
        return head;
    }
}
