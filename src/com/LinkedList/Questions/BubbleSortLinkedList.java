package com.LinkedList.Questions;
public class BubbleSortLinkedList {

    private ListNode head;
    private ListNode tail;
    private int size;

    public BubbleSortLinkedList () {
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

    public ListNode get(int index){
        ListNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void insertLast(int val){
        ListNode newNode = new ListNode(val);
        if (head == null){
            head = newNode;
            tail= newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;

    }

    public void display(){
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");


    }

    public void bubbleSort(){
        bubbleSort(size -1, 0);
    }

    private void bubbleSort(int row, int col){
        if (row == 0){
            return;
        }
        if (col < row){
            ListNode first = get(col);
            ListNode second = get(col + 1);

            if (first.val > second.val){
                if (first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    ListNode prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                }else {
                    ListNode prev = get(col -1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col+1);
        }else {
            bubbleSort(row-1, 0);
        }
    }

    public static void main(String[] args) {
        BubbleSortLinkedList list = new BubbleSortLinkedList();
        for (int i = 10; i > 0 ; i--) {
            list.insertLast(i);
        }
        list.display();
        list.bubbleSort();
        list.display();
    }
}
