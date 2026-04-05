import java.util.*;

class KadaneAlgorithm2 {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        System.out.print("Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        return maxSum;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        KadaneAlgorithm2 obj = new KadaneAlgorithm2();
        int maxSum = obj.maxSubArray(arr);

        System.out.println("Maximum subarray sum is: " + maxSum);
    }
}