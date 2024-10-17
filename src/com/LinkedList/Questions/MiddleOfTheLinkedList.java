package com.LinkedList.Questions;
// https://leetcode.com/problems/middle-of-the-linked-list/submissions/1418714354/
public class MiddleOfTheLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public MiddleOfTheLinkedList() {
        this.size = 0;
    }

    public class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // Here!
    public Node middleNode(Node head){
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


}
