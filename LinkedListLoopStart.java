import java.util.*;

class Node {
    int val;
    Node next;

    Node() {
        val = 0;
        next = null;
    }

    Node(int data1) {
        val = data1;
        next = null;
    }

    Node(int data1, Node next1) {
        val = data1;
        next = next1;
    }
}

class LinkedListLoopStart {

    public Node detectCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        fifth.next = third;

        LinkedListLoopStart solution = new LinkedListLoopStart();

        Node start = solution.detectCycle(head);

        if (start != null) {
            System.out.println("Starting point of loop: " + start.val);
        } else {
            System.out.println("No loop detected.");
        }
    }
}
