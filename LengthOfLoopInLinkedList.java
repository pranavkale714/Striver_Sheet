import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public int lengthOfLoop(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return countLoopLength(slow);
            }
        }

        return 0;
    }

    private int countLoopLength(ListNode meetingPoint) {
        ListNode temp = meetingPoint;
        int length = 1;

        while (temp.next != meetingPoint) {
            temp = temp.next;
            length++;
        }

        return length;
    }
}

public class LengthOfLoopInLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = second;

        Solution solution = new Solution();
        System.out.println(solution.lengthOfLoop(head));
    }
}
