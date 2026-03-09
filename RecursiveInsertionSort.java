public class RecursiveInsertionSort {
    // Recursive insertion sort function
    static void insertionSort(int[] arr, int i, int n) {
        // Base case
        if (i == n) return;

        int j = i;
        // Move the current element back until it's in the correct place
        while (j > 0 && arr[j - 1] > arr[j]) {
            // Swap arr[j] and arr[j-1]
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        // Recur for the next index
        insertionSort(arr, i + 1, n);
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;

        System.out.println("Before Using Insertion Sort:");
        for (int value : arr)
            System.out.print(value + " ");
        System.out.println();

        insertionSort(arr, 0, n);

        System.out.println("After Using Insertion Sort:");
        for (int value : arr)
            System.out.print(value + " ");
        System.out.println();
    }
}
