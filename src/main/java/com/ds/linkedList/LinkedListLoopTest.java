package com.ds.linkedList;

public class LinkedListLoopTest {
    public static void main(String[] args) {

        Node node8 = new Node(8, null);
        ;
        Node node7 = new Node(7, node8);
        Node node6 = new Node(6, node7);
        Node node5 = new Node(5, node6);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);

        node8.setNext(node7);
        Node head = node1;

        Node slow = head;
        Node fast = head;


        while (slow != null || fast != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow == fast) {
                System.out.println("loop exist");
                slow = head;
                break;
            }

        }

        while (true) {
            if (slow == fast) {
                System.out.println("Starting Point ==> " + slow.getValue());
                break;
            }
            slow = slow.getNext();
            fast = fast.getNext();
        }
    }
}
