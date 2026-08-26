class ListNode {
    int val;
    ListNode next;
    ListNode child;

    ListNode() {
        val = 0;
        next = null;
        child = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        child = null;
    }

    ListNode(int data1, ListNode next1, ListNode child1) {
        val = data1;
        next = next1;
        child = child1;
    }
}

class Solution {

    private ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(-1);
        ListNode res = dummyNode;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                res.child = list1;
                res = list1;
                list1 = list1.child;
            } else {
                res.child = list2;
                res = list2;
                list2 = list2.child;
            }

            res.next = null;
        }

        if (list1 != null) {
            res.child = list1;
        } else {
            res.child = list2;
        }

        return dummyNode.child;
    }

    public ListNode flattenLinkedList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mergedHead = flattenLinkedList(head.next);

        return merge(head, mergedHead);
    }
}

public class FlattenLinkedList {

    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.child;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.child = new ListNode(14);

        head.next = new ListNode(10);
        head.next.child = new ListNode(4);

        head.next.next = new ListNode(12);
        head.next.next.child = new ListNode(20);
        head.next.next.child.child = new ListNode(13);

        head.next.next.next = new ListNode(7);
        head.next.next.next.child = new ListNode(17);

        Solution sol = new Solution();

        ListNode flattened = sol.flattenLinkedList(head);

        System.out.print("Flattened Linked List: ");
        printLinkedList(flattened);
    }
}
