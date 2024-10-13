package com.LinkedList.Questions;

public class RemoveDuplicate {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) {
              this.val = val;
          }
          ListNode(int val, ListNode next) {
              this.val = val; this.next = next;
          }
      }

      public ListNode deleteDuplicates(ListNode node)   {
          if (node == null){
              return node;
          }
          ListNode head = node;
          while(node.next != null){
              if (node.val == node.next.val){
                  node.next = node.next.next;
              }else {
                  node = node.next;
              }
          }
          return head;
      }


      public ListNode deleteDup(ListNode node){
          if (node == null){
              return node;
          }
          ListNode head = node;
          while (node.next != null){
              if (node.val == node.next.val){
                  node = node.next.next;
              }else {
                  node = node.next;
              }
          }
          return head;
      }

      public ListNode dupDelete(ListNode node){
          if (node == null){  // Handle an empty list
              return node;
          }
          ListNode head = node;
          while (node.next != null){ // Traverse the list
              if (node.val == node.next.val){ // Found a duplicate
                  node.next = node.next.next;  // Skip the duplicate
              }
              else {
                  node = node.next;  // Move to the next node
              }
          }
          return head; // Return the updated list without duplicates
      }


}
