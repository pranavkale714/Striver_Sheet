import java.util.*;

class KadaneAlgorithm {
    public int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                maxi = Math.max(maxi, sum);
            }
        }

        return maxi;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        KadaneAlgorithm obj = new KadaneAlgorithm();
        int maxSum = obj.maxSubArray(arr);

        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}