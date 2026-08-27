class Node {
    int data;
    Node prev, next;

    Node(int val) {
        data = val;
        prev = null;
        next = null;
    }
}

public class DeleteLastNodeOfDoublyLinkedList {

    public static Node deleteLastNode(Node head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return null;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;

        return head;
    }

    public static void print(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        System.out.println("Original Doubly Linked List:");
        print(head);

        head = deleteLastNode(head);

        System.out.println("After Deleting Last Node:");
        print(head);
    }
}
