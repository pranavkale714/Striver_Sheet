import java.util.*;

class LastOccurrenceFinder {

    public int findLastOccurrence(int n, int key, List<Integer> arr) {
        int low = 0;
        int high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr.get(mid) == key) {
                ans = mid;
                low = mid + 1;
            } else if (key < arr.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}

public class Main {

    public static void main(String[] args) {

        int key = 13;

        List<Integer> arr = Arrays.asList(3, 4, 13, 13, 13, 20, 40);

        int n = arr.size();

        LastOccurrenceFinder finder = new LastOccurrenceFinder();

        int result = finder.findLastOccurrence(n, key, arr);

        System.out.println(result);
    }
}
