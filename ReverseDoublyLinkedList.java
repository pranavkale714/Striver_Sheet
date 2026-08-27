import java.util.*;

class DNode {
    int data;
    DNode next;
    DNode back;

    DNode(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }

    DNode(int data, DNode next, DNode back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }
}

class ReverseDoublyLinkedList {
    public DNode convertArr2DLL(int[] arr) {
        DNode head = new DNode(arr[0]);
        DNode prev = head;

        for (int i = 1; i < arr.length; i++) {
            DNode temp = new DNode(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }

    public DNode reverseDLL(DNode head) {
        DNode current = head;
        DNode last = null;

        while (current != null) {
            DNode temp = current.next;
            current.next = current.back;
            current.back = temp;
            last = current;
            current = temp;
        }

        return last;
    }

    public void printDLL(DNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        ReverseDoublyLinkedList list = new ReverseDoublyLinkedList();

        int[] arr = {1, 2, 3, 4, 5};

        DNode head = list.convertArr2DLL(arr);

        System.out.print("Original DLL: ");
        list.printDLL(head);

        DNode reversed = list.reverseDLL(head);

        System.out.print("Reversed DLL: ");
        list.printDLL(reversed);
    }
}
