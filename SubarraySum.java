import java.util.*;

class SubarraySum {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;

        SubarraySum sol = new SubarraySum();
        int result = sol.subarraySum(arr, k);

        System.out.println("The number of subarrays is: " + result);
    }
}
