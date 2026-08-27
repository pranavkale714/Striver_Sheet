class Node {
    int data;
    Node next;

    Node(int data1) {
        data = data1;
        next = null;
    }
}

class LinkedListLength {
    public int lengthOfLinkedList(Node head) {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        LinkedListLength obj = new LinkedListLength();

        System.out.println("Length of Linked List: " + obj.lengthOfLinkedList(head));
    }
}
