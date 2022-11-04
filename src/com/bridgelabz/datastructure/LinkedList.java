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

    public void show() {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            Node<T> temp = head;
            while (temp != null) {
                System.out.println(temp.getData() + " ");
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
