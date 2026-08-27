import java.util.*;

class MissingKFinder {
    public int missingK(int[] vec, int k) {
        int low = 0, high = vec.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int missing = vec[mid] - (mid + 1);

            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return k + high + 1;
    }

    public static void main(String[] args) {
        int[] vec = {4, 7, 9, 10};
        int k = 4;

        MissingKFinder finder = new MissingKFinder();
        int ans = finder.missingK(vec, k);

        System.out.println("The missing number is: " + ans);
    }
}
