import java.util.*;

class MaxZeroSumSubarray {
    public int maxLen(int[] A, int n) {
        Map<Integer, Integer> mpp = new HashMap<>();
        int maxi = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += A[i];

            if (sum == 0) {
                maxi = i + 1;
            } else {
                if (mpp.containsKey(sum)) {
                    maxi = Math.max(maxi, i - mpp.get(sum));
                } else {
                    mpp.put(sum, i);
                }
            }
        }
        return maxi;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] A = new int[]{9, -3, 3, -1, 6, -5};
        int n = A.length;

        int ans = new MaxZeroSumSubarray().maxLen(A, n);
        System.out.println(ans);
    }
}
