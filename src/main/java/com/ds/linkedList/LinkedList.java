package com.ds.linkedList;

public class LinkedList {
    public static void main(String[] args) {

        Node node5 = new Node(5, null);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);

        Node head = node1;
        Node heading = node1;
        while (head.next != null) {
            head = head.next;
        }

        Node next = new Node(100, null);
        head.next = next;


        while (heading != null) {
            System.out.print(heading.data + " ");
            heading = heading.next;
        }
    }
}

class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
