package com.LinkedList.Questions;
// https://leetcode.com/problems/reverse-linked-list-ii/
public class ReverseLinkedListII {
    private ListNode head;
    private ListNode tail;
    private int size;

    public ReverseLinkedListII() {
        this.size = 0;
    }

    public class ListNode {
        private int val;
        private ListNode next;
        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode() {
        }
    }



    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }

        // Skip the first left - 1 nodes
        ListNode current = head;
        ListNode previous = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            previous = current;
            current = current.next;
        }


        ListNode last = previous;
        ListNode newEnd = current;

        // Reverse between left and right

        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = previous;
            previous = current;
            current = current.next;
            if (next != null){
                next = next.next;
            }
        }

        if (last != null){
            last.next = previous;
        }else {
            head = previous;
        }

        newEnd.next = current;
        return head;
    }
}
