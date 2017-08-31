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
    public boolean delete(int data) {
        Node1 parent = root;
        Node1 current = root;
        boolean isleft = false;
        while (current.data != data) {
            parent = current;
            if (current.data > data) {
                isleft = true;
                current = current.left;

            } else {
                isleft = false;
                current = current.right;

            }
            if (current == null) {
                return false;
            }
        }
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            }
                if (isleft == true) {
                    parent.left = null;

                } else {
                    parent.right = null;
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else if (isleft) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            } else if (current.left != null && current.right != null) {
                Node1 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;

                } else if (isleft) {
                    parent.left = successor;

                } else {
                    parent.right = successor;
                }
                successor.left = current.left;
            }

        return true;

    }
 public Node1 getSuccessor(Node1 deleteNode){
        Node1 successor=null;
        Node1 successorParent=null;
        Node1 current=deleteNode.right;
        while(current!=null) {
            successorParent = successor;
            successor = current;
            current = current.left;
        }
        if(successor!=deleteNode.right){
            successorParent.left=successor.right;
            successor.right=deleteNode.right;
        }
        return successor;
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
        BinarySearchTree bst=new BinarySearchTree();
        bst.insert(5);
        bst.insert(8);
        bst.insert(11);
        bst.insert(2);
        bst.insert(15);
        bst.insert(14);
        bst.insert(18);
        System.out.println("delete node with two children" +" "+  bst.delete(15));
        System.out.println(search(8,node1));


    }
}
