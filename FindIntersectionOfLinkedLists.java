class Node {
    int num;
    Node next;

    Node(int val) {
        num = val;
        next = null;
    }
}

class Solution {
    public int getDifference(Node head1, Node head2) {
        int len1 = 0;
        int len2 = 0;

        while (head1 != null || head2 != null) {
            if (head1 != null) {
                len1++;
                head1 = head1.next;
            }

            if (head2 != null) {
                len2++;
                head2 = head2.next;
            }
        }

        return len1 - len2;
    }

    public Node intersectionPresent(Node head1, Node head2) {
        int diff = getDifference(head1, head2);

        if (diff < 0) {
            while (diff++ != 0) {
                head2 = head2.next;
            }
        } else {
            while (diff-- != 0) {
                head1 = head1.next;
            }
        }

        while (head1 != null && head2 != null) {
            if (head1 == head2) {
                return head1;
            }

            head1 = head1.next;
            head2 = head2.next;
        }

        return null;
    }

    public void printList(Node head) {
        while (head != null && head.next != null) {
            System.out.print(head.num + "->");
            head = head.next;
        }

        if (head != null) {
            System.out.print(head.num);
        }

        System.out.println();
    }
}

public class FindIntersectionOfLinkedLists {
    public static void main(String[] args) {
        Solution sol = new Solution();

        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(4);

        Node head1 = head;

        Node head2 = new Node(3);
        head2.next = head.next.next.next;

        System.out.print("List1: ");
        sol.printList(head1);

        System.out.print("List2: ");
        sol.printList(head2);

        Node answerNode = sol.intersectionPresent(head1, head2);

        if (answerNode == null) {
            System.out.println("No intersection");
        } else {
            System.out.println("The intersection point is " + answerNode.num);
        }
    }
}
