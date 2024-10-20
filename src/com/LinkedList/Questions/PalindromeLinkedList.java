package com.LinkedList.Questions;
// https://leetcode.com/problems/palindrome-linked-list/
public class PalindromeLinkedList {

    private ListNode head;
    private ListNode tail;
    private int size;

    public PalindromeLinkedList() {
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


    public boolean isPalindrome(ListNode head){
        ListNode mid = getMid(head);
        ListNode headSecond = reverseList(mid);
        ListNode reReverseHead = headSecond;

        // compare both halves
        while (head != null && headSecond != null){
            if (head.val != headSecond.val){
                break;
            }
            head = head.next;
            headSecond  = headSecond.next;
        }
        reverseList(reReverseHead);
        return head == null || headSecond == null;
    }



    public ListNode reverseList(ListNode head){
        if (head == null){
            return head;
        }

        ListNode previous = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null){
            present.next = previous;
            previous = present;
            present = next;
            if (next != null){
                next = next.next;
            }
        }
        return previous;
    }


    public ListNode getMid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }




}
