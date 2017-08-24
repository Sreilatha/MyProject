package com.srilatha;

public class BinarySearchTree {
    public Node1 root;

    public BinarySearchTree() {
        this.root = null;
    }

    public static boolean search(int data, Node1 current) {
        if (current == null) {
            return false;
        }
        if (current.data == data) {
            return true;
        }
        if (data > current.data) {
            return search(data, current.right);
        }
        if (data < current.data) {
            return search(data, current.left);
        }
        return false;
    }
    public static void main(String[] args){
        Node1 node=new Node1(1);
        Node1 node1=new Node1(2);
        Node1 node2=new Node1(3);
        node1.left=node;
        node1.right=node2;
        System.out.println(search(0,node1));

    }
}
