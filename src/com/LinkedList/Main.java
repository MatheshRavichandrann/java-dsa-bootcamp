package com.LinkedList;
public class Main {
    public static void main(String[] args) {
//        Linkedlist list = new Linkedlist();
//        list.insert(5, 0);
//        list.insert(10, 1);
//        list.insert(15, 2);
//        list.insertFirst(3);
//        list.insertFirst(6);
//        list.insertFirst(36);
//        list.insertFirst(69);
//        list.insertLast(99);
//        list.insert(100, 3);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();

//        DoublyLinkedList list1 = new DoublyLinkedList();
//        list1.insertFirst(34);
//        list1.insertFirst(22);
//        list1.insertFirst(12);
//        list1.insertLast(99);
//        list1.insertAfter(22, 69);
//        list1.display();

//        CircularLinkedList list = new CircularLinkedList();
//        list.insert(34);
//        list.insert(24);
//        list.insert(36);
//        list.insert(69);
//        list.delete(34);
//        list.display();


        Linkedlist list = new Linkedlist();
        list.insert(5, 0);
        list.insert(10, 1);
        list.insert(15, 2);
        list.display();
        list.insertRec(69, 2);
        list.display();


    }
}
