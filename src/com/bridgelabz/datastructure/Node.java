package com.bridgelabz.datastructure;

public class Node<T> {
    private T data;

    public Node(T data) {
        this.data = data;
    }
    private Node<T> next;

    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
        public Node<T> getNext () {
            return next;
        }
        public void setNext (Node <T> next) {
            this.next = next;
        }
    }
