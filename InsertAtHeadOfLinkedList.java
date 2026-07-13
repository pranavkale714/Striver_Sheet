class ListNode {
    int data;
    ListNode next;

    ListNode(int data1, ListNode next1) {
        data = data1;
        next = next1;
    }

    ListNode(int data1) {
        data = data1;
        next = null;
    }
}

class InsertAtHeadOfLinkedList {
    public ListNode insertAtHead(ListNode head, int val) {
        return new ListNode(val, head);
    }
}
