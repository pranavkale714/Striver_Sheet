class Solution {
    public boolean solve(int i, int n, int[] arr, int k) {
        if (k == 0) {
            return true;
        }

        if (k < 0 || i == n) {
            return false;
        }

        return solve(i + 1, n, arr, k - arr[i])
                || solve(i + 1, n, arr, k);
    }

    public boolean checkSubsequenceSum(int[] nums, int target) {
        return solve(0, nums.length, nums, target);
    }
}

public class CheckSubsequenceSum {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 2, 3, 4};
        int target = 5;

        System.out.println(sol.checkSubsequenceSum(nums, target));
    }
}
