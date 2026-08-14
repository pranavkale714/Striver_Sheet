class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

class LinkedList {
    Node append(Node head, int value) {
        Node newNode = new Node(value);

        if (head == null) {
            return newNode;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

        return head;
    }

    void printList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data);
            current = current.next;
        }

        System.out.println();
    }
}

class Solution {
    int addOneUtil(Node node) {
        if (node == null) {
            return 1;
        }

        int carry = addOneUtil(node.next);
        int sum = node.data + carry;

        node.data = sum % 10;

        return sum / 10;
    }

    Node addOne(Node head) {
        int carry = addOneUtil(head);

        if (carry != 0) {
            Node newHead = new Node(carry);
            newHead.next = head;
            head = newHead;
        }

        return head;
    }
}

public class AddOneToLinkedListNumber {
    public static void main(String[] args) {
        Node head = null;

        LinkedList ll = new LinkedList();
        Solution sol = new Solution();

        head = ll.append(head, 1);
        head = ll.append(head, 2);
        head = ll.append(head, 9);

        System.out.print("Original Number: ");
        ll.printList(head);

        head = sol.addOne(head);

        System.out.print("After Adding One: ");
        ll.printList(head);
    }
}
