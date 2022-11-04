package com.bridgelabz.datastructure;

public class LinkedList<T> {
    public Node<T> head;
    public Node<T> tail;

    public void push(T data) {
        Node<T> node = new Node<>();
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head = node;
        }
    }
}
