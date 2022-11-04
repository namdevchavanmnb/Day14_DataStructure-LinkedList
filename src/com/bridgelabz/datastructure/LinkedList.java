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
