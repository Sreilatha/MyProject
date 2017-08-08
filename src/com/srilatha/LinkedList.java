package com.srilatha;

/**
 * Created by Srilatha on 7/26/2017.
 */
public class LinkedList {
    private Node first;

    public LinkedList() {

    }

    public boolean isEmpty() {

        return (first == null);
    }

    public void insertFirst(int data) {
        Node node = new Node();
        node.data = data;
        node.next = first;
        first = node;
    }

    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void displaytList() {
        System.out.println("List(first------->last)");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
    }
    public void insertLast(int data){
        Node current =first;
        while(current.next!=null){
            current=current.next;
        }
        Node node=new Node();
        node.data=data;
        current.next=node;

    }
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.insertFirst(6);
        list.insertFirst(1);
        list.insertFirst(8);
        list.insertFirst(14);
        list.insertFirst(21);
        list.insertLast(11);
        list.displaytList();
    }
}
