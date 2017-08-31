package com.srilatha;
public class BinarySearchTree {
    public Node1 root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int data){
        Node1 node3=new Node1(data);
        if(root==null){
            root=node3;
        return;
        }
        Node1 current=root;
        Node1 parent=null;
        while(true){
            parent=current;
            if(data<current.data){
                current=current.left;
                if(current==null){
                    parent.left=node3;
                    return;

                }
            }else if(data>current.data){
                current=current.right;
                if(current==null){
                    parent.right=node3;
                    return;
                }
            }
        }

    }
//    public boolean delete(int data){
//
//    }

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
        BinarySearchTree bst=new BinarySearchTree();
        bst.insert(5);
        bst.insert(8);
        bst.insert(11);
        bst.insert(2);
        System.out.println(search(8,node1));


    }
}
