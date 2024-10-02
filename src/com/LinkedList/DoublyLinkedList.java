package com.LinkedList;

public class DoublyLinkedList {

    private Node head;

    // Insert a new node at the beginning of the list
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    // Insert a new node at the end of the list
    public void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        node.next = null;
    }

    // Find a Particular Node
    public Node find(int value){
        Node node = head;
        while (node != null){
            if (node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // Insert After a particular node
    public void insertAfter(int after, int val){
        Node p = find(after);

        if (p == null){
            System.out.println("Does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null){
            node.next.prev = node;
        }

    }

    // Display the elements of the list
    public void display() {
        Node temp = head;
        if (temp == null) {
            System.out.print("List is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    // Node class representing each element of the list
    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
