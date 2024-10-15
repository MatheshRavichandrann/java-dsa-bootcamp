package com.workout;
public class ArrowList {

    private Node head;
    private Node tail;
    private int size;

    public ArrowList() {
        this.size = 0;
    }

    public static class Node{
        private int value;
        private Node next;

        public Node() {
        }

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }



    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int value){
        if (tail == null){
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void insert(int value, int index){
        if (index == 0){
            insertFirst(value);
            return;
        }
        if (index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size +=1 ;
    }

    public boolean find(int value){
        Node node = head;
        while (node != null){
            if (node.value == value){
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public static void main(String[] args) {
        ArrowList list = new ArrowList();
        for (int i = 10; i > 0 ; i--) {
            list.insertFirst(i);
        }
        list.display();
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            list.insertLast(i);

        }
        list.display();
        System.out.println();
        list.insert(69, 5);
        list.insert(79, 6);
        list.insert(89, 7);
        list.insert(99, 8);
        list.display();
        System.out.println();
        System.out.println(list.size);
        System.out.println(list.find(123));
        System.out.println(list.find(69));


    }



}
