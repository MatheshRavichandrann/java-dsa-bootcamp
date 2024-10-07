package com.LinkedList.Questions;

public class LinkedListCycleII {

    private Node head;
    private Node tail;
    private int size;

    public LinkedListCycleII() {
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

    public int lengthOfCycle(Node slow) {
        Node temp = slow;
        int length = 0;
        do {
            temp = temp.next;
            length++;
        } while (slow != temp);
        return length;
    }

    public Node detectCycle(Node head) {
        int length = 0;
        Node fast = head;
        Node slow = head;

        // Detect the cycle using the fast and slow pointers
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                length = lengthOfCycle(slow);  // Calculate the length of the cycle
                break;
            }
        }

        // If no cycle is found, return null
        if (length == 0) {
            return null;
        }

        Node first = head;
        Node second = head;

        // Move the second pointer 'length' steps ahead
        while (length > 0) {
            second = second.next;
            length--;
        }

        // Move both pointers one step at a time until they meet at the start of the cycle
        while (first != second) {
            first = first.next;
            second = second.next;
        }

        return first;  // Return the start node of the cycle
    }
}
