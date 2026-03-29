import java.util.*;

class LongestZeroSumSubarray {

    public int solve(int[] a) {
        int maxLen = 0;
        Map<Integer, Integer> sumIndexMap = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];

            if (sum == 0) {
                maxLen = i + 1;
            } else if (sumIndexMap.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - sumIndexMap.get(sum));
            } else {
                sumIndexMap.put(sum, i);
            }
        }

        return maxLen;
    }
}

public class Main {

    public static void main(String[] args) {
        int[] a = new int[] {9, -3, 3, -1, 6, -5};
        int ans = new LongestZeroSumSubarray().solve(a);
        System.out.println(ans);
    }
}