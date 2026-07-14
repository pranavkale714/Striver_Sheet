class ListNode {
    int data;
    ListNode next;

    ListNode(int val) {
        data = val;
        next = null;
    }
}

class DeleteTailLinkedList {
    public ListNode deleteTail(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode curr = head;

        while (curr.next.next != null) {
            curr = curr.next;
        }

        curr.next = null;

        return head;
    }
}

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        DeleteTailLinkedList obj = new DeleteTailLinkedList();
        head = obj.deleteTail(head);

        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
