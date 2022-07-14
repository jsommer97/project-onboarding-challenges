package models;

public class LinkedList {

    public Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public LinkedList insert(LinkedList list, Node node) {
       if (list.head.next == null) {
           list.head.next = node;
       } else {
           Node pointer = list.head.next;

           while(pointer.next != null) {
               pointer = pointer.next;
           }

           pointer.next = node;
       }

       return list;
    }
}
