import java.util.Arrays;

class RotateArrayByK {

    public void rotateRight(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;

        k = k % n;

        int[] temp = Arrays.copyOfRange(arr, n - k, n);

        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }

    public void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;

        k = k % n;

        int[] temp = Arrays.copyOfRange(arr, 0, k);

        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        RotateArrayByK sol = new RotateArrayByK();

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;

        sol.rotateRight(arr, k);
        System.out.println("Array after right rotation: " + Arrays.toString(arr));

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        sol.rotateLeft(arr2, k);
        System.out.println("Array after left rotation: " + Arrays.toString(arr2));
    }
}