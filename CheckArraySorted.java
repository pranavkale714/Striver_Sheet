class CheckArraySorted {
    public boolean isSorted(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i])
                    return false;
            }
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 5;

        CheckArraySorted obj = new CheckArraySorted();
        boolean ans = obj.isSorted(arr, n);

        if (ans)
            System.out.println("True");
        else
            System.out.println("False");
    }
}