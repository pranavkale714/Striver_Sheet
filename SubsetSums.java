import java.util.*;

class SubsetSums {
    public List<Integer> subsetSums(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        findSums(0, 0, nums, ans);
        return ans;
    }

    private void findSums(int ind, int sum, int[] nums,
                          List<Integer> ans) {
        // Base case
        if (ind == nums.length) {
            ans.add(sum);
            return;
        }

        // Exclude the current element
        findSums(ind + 1, sum, nums, ans);

        // Include the current element
        findSums(ind + 1, sum + nums[ind], nums, ans);
    }
}
