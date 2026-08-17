import java.util.*;

// Definition for singly-linked list
class Node {
    int val;
    Node next;

    Node() {}

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

class AddTwoNumbers {

    public Node addTwoNumbers(Node l1, Node l2) {

        // Initialize a dummy node
        Node dummy = new Node();
        Node temp = dummy;

        int carry = 0;

        // Iterate till the end of both lists
        while (l1 != null || l2 != null || carry != 0) {

            int sum = 0;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Add carry and calculate new carry
            sum += carry;
            carry = sum / 10;

            // Store current digit
            Node node = new Node(sum % 10);

            temp.next = node;
            temp = temp.next;
        }

        return dummy.next;
    }
}

public class Main {

    static Node createList(int[] arr) {

        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }

        return head;
    }

    static void printList(Node head) {

        while (head != null) {
            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] num1 = {2, 4, 3}; // represents 342
        int[] num2 = {5, 6, 4}; // represents 465

        Node l1 = createList(num1);
        Node l2 = createList(num2);

        AddTwoNumbers solution = new AddTwoNumbers();

        Node result = solution.addTwoNumbers(l1, l2);

        printList(result);
    }
}
