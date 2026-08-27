import java.util.*;

class SubarrayPartitioner {
    // Counts how many partitions are needed for a given maxSum
    public int countPartitions(int[] a, int maxSum) {
        int partitions = 1; // at least one partition
        long subarraySum = 0; // sum of current subarray

        for (int num : a) {
            if (subarraySum + num <= maxSum) {
                subarraySum += num;
            } else {
                partitions++;
                subarraySum = num;
            }
        }
        return partitions;
    }

    // Finds the minimum largest subarray sum possible for at most k partitions
    public int largestSubarraySumMinimized(int[] a, int k) {
        int low = Arrays.stream(a).max().getAsInt(); // largest element
        int high = Arrays.stream(a).sum(); // sum of all elements

        // Binary search for the smallest maxSum
        while (low <= high) {
            int mid = (low + high) / 2;
            int partitions = countPartitions(a, mid);

            if (partitions > k) {
                low = mid + 1; // too many partitions → increase maxSum
            } else {
                high = mid - 1; // valid but try smaller maxSum
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int k = 2;
        SubarrayPartitioner sp = new SubarrayPartitioner();
        int ans = sp.largestSubarraySumMinimized(a, k);
        System.out.println("The answer is: " + ans);
    }
}
