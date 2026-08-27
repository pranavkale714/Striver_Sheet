import java.util.*;

class CountOccurrencesInSortedArray {
    // find first index of key using binary search
    public int firstOccurrence(int n, int key, List<Integer> v) {
        int start = 0, end = n - 1, res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (v.get(mid) == key) {
                res = mid;
                end = mid - 1; // move left
            } else if (key < v.get(mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }

    // find last index of key using binary search
    public int lastOccurrence(int n, int key, List<Integer> v) {
        int start = 0, end = n - 1, res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (v.get(mid) == key) {
                res = mid;
                start = mid + 1; // move right
            } else if (key < v.get(mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }

    // count occurrences
    public int countOccurrences(int n, int key, List<Integer> v) {
        int first = firstOccurrence(n, key, v);
        if (first == -1) return 0; // key not found
        int last = lastOccurrence(n, key, v);
        return last - first + 1;
    }
}

public class Main {
    public static void main(String[] args) {
        int key = 13;
        List<Integer> v = Arrays.asList(3, 4, 13, 13, 13, 20, 40);
        int n = v.size();

        CountOccurrencesInSortedArray sol = new CountOccurrencesInSortedArray();
        int ans = sol.countOccurrences(n, key, v);

        System.out.println("Occurrences of " + key + " = " + ans);
    }
}
