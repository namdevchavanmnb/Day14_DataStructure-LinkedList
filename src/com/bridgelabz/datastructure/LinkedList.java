package com.bridgelabz.datastructure;

public class LinkedList<T> {
    public Node<T> head;
    public Node<T> tail;

    public void push(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head = node;
        }
    }

    public void add(T data) {
        Node<T> newnode = new Node<>(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.setNext(newnode);
            tail = newnode;
        }
    }
    public Node<T> search(T searchData) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.getData().equals(searchData))
                return temp;
            temp = (Node<T>) temp.getNext();
        }
        return null;
    }

    public boolean searchAndInsert(T searchData, T insertData) {
        Node<T> newNode = new Node(insertData);
        Node<T> searchedNode = search(searchData);
        if (searchedNode == null)
            return false;
        else {
            newNode.setNext(searchedNode.getNext());
            searchedNode.setNext(newNode);
            return true;
        }

    }
    public void show() {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            Node<T> temp = head;
            while (temp != null) {
                System.out.print(temp.getData() + " ");
                temp = (Node<T>) temp.getNext();
            }
            System.out.println();
        }
    }

    public boolean isEmpty() {
        return head == null ? true : false;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }

}
