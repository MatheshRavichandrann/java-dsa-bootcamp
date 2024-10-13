package com.forInterview;

import com.LinkedList.Questions.MergeSortLinkedListUsingTernary;

public class SortLinkedList {

    private ListNode head;
    private ListNode tail;
    private int size;
    public SortLinkedList() {
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

    public ListNode sortList(ListNode head){
        if (head == null || head.next == null){
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left, right);
    }

    public ListNode merge(ListNode listOne, ListNode listTwo){
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while (listOne != null && listTwo != null){
            if (listOne.val < listTwo.val){
                tail.next = listOne;
                listOne = listOne.next;
            }else {
                tail.next = listTwo;
                listTwo = listTwo.next;
            }
            tail = tail.next;
        }

        tail.next = (listOne != null) ? listOne : listTwo;
        return dummyHead.next;
    }

    public ListNode getMid(ListNode head){
        ListNode midPrev = null;
        while (head != null && head.next != null){
//            if (midPrev == null){
//                midPrev = head;
//            }else {
//                midPrev = midPrev.next;
//            }
//            head = head.next.next;
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;


    }


    public void insertFirst(int val){
        ListNode node = new ListNode(val);
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


    public static void main(String[] args) {
        SortLinkedList list = new SortLinkedList();
        list.insertFirst(45);
        list.insertFirst(4);
        list.insertFirst(34);
        list.insertFirst(6);
        list.insertFirst(69);
        list.insertFirst(11);
        list.insertFirst(8);
        list.insertFirst(23);

        list.display();
        System.out.println();

        list.head = list.sortList(list.head);
        list.display();

    }



}
