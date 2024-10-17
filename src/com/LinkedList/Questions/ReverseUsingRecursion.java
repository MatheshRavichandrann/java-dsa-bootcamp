package com.LinkedList.Questions;

import com.workout.ArrowList;

public class ReverseUsingRecursion {
    private ListNode head;
    private ListNode tail;
    private int size;

    public ReverseUsingRecursion() {
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

    public void insertFirst(int value){
        ListNode node = new ListNode(value);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size += 1;
    }


    public void display(){
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    // recursion reverse
    private void reverse(ListNode node){
        if (node == tail){
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // In place reversal of linked list
    public void reverse(){
        if (size < 2){
            return;
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
        head = previous;

    }

    public static void main(String[] args) {
        ReverseUsingRecursion list = new ReverseUsingRecursion();
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(46);
        list.insertFirst(8);
        list.insertFirst(23);
        list.insertFirst(69);
        list.insertFirst(34);
        list.display();
        list.reverse(list.head);
        System.out.println();
        list.display();
        System.out.println();
        list.reverse();
        list.display();



    }
}

