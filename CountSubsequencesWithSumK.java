import java.util.*;

class Solution {
    private int func(int ind, int sum, int[] nums) {
        if (sum == 0) return 1;
        if (sum < 0 || ind == nums.length) return 0;

        return func(ind + 1, sum - nums[ind], nums)
                + func(ind + 1, sum, nums);
    }

    public int countSubsequenceWithTargetSum(int[] nums, int target) {
        return func(0, target, nums);
    }
}

public class CountSubsequencesWithSumK {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 2, 3, 4};
        int target = 5;

        System.out.println(sol.countSubsequenceWithTargetSum(nums, target));
    }
}
