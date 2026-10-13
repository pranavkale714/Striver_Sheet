import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> results = new ArrayList<>();
        backtrack(k, n, 1, new ArrayList<>(), results);
        return results;
    }

    private void backtrack(int k, int remainingSum, int start, List<Integer> current, List<List<Integer>> results) {
        if (current.size() == k && remainingSum == 0) {
            results.add(new ArrayList<>(current));
            return;
        }
        if (current.size() > k || remainingSum < 0) {
            return;
        }

        for (int i = start; i <= 9; i++) {
            current.add(i);
            backtrack(k, remainingSum - i, i + 1, current, results);
            current.remove(current.size() - 1);  // backtrack
        }
    }
}
