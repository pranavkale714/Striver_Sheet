class Node {
    int data;
    Node prev;
    Node next;

    Node(int val) {
        data = val;
        prev = null;
        next = null;
    }
}

class Solution {

    public void insertAtEnd(Node[] headRef, int val) {
        Node newNode = new Node(val);

        if (headRef[0] == null) {
            headRef[0] = newNode;
            return;
        }

        Node temp = headRef[0];

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    public void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" <-> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    public Node deleteTargetNodes(Node head, int target) {
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;

            if (current.data == target) {

                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                }
            }

            current = nextNode;
        }

        return head;
    }
}

public class DeleteAllOccurrencesOfKeyInDLL {

    public static void main(String[] args) {

        Solution sol = new Solution();
        Node[] headRef = new Node[1];

        sol.insertAtEnd(headRef, 1);
        sol.insertAtEnd(headRef, 2);
        sol.insertAtEnd(headRef, 3);
        sol.insertAtEnd(headRef, 2);
        sol.insertAtEnd(headRef, 4);
        sol.insertAtEnd(headRef, 2);
        sol.insertAtEnd(headRef, 5);

        System.out.println("Original List:");
        sol.printList(headRef[0]);

        int target = 2;

        headRef[0] = sol.deleteTargetNodes(headRef[0], target);

        System.out.println("\nList after deleting value " + target + ":");
        sol.printList(headRef[0]);
    }
}
