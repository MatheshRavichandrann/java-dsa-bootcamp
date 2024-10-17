package com.LinkedList.Questions;

import java.util.LinkedList;

public class MergeSortLinkedListUsingTernary {
    private ListNode head;
    private ListNode tail;
    private int size;

    public MergeSortLinkedListUsingTernary() {
        this.size = 0;
    }

    // Definition for singly-linked list node
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

    // Insert at the end of the list
    public void insertLast(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Display the list
    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Merge Sort the LinkedList
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left, right);
    }

    // Merge two sorted lists
    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }
        
        return dummyHead.next;
    }

    // Find the middle node to split the list
    public ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            if (midPrev == null) {
                midPrev = head;
            } else {
                midPrev = midPrev.next;
            }
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        MergeSortLinkedListUsingTernary list = new MergeSortLinkedListUsingTernary();

        // Insert elements into the list
        list.insertLast(4);
        list.insertLast(1);
        list.insertLast(5);
        list.insertLast(2);
        list.insertLast(3);

        System.out.println("Original List:");
        list.display();

        // Sort the list
        list.head = list.sortList(list.head);

        System.out.println("Sorted List:");
        list.display();
    }
}
