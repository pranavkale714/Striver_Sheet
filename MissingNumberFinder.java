public class MissingNumberFinder {

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;

        for (int i = 1; i <= n; i++) {
            boolean found = false;

            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(findMissingNumber(arr));
    }
}