class LinkedListIntroduction {
    int data;
    LinkedListIntroduction next;

    LinkedListIntroduction(int data, LinkedListIntroduction next) {
        this.data = data;
        this.next = next;
    }

    LinkedListIntroduction(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};

        LinkedListIntroduction y = new LinkedListIntroduction(arr[0]);

        System.out.println(y);
        System.out.println(y.data);
    }
}
