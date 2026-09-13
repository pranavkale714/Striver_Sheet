import java.util.*;

class Solution {
    private void helper(String s, int index, StringBuilder current, List<String> result) {
        if (index == s.length()) {
            result.add(current.toString());
            return;
        }

        helper(s, index + 1, current, result);

        current.append(s.charAt(index));
        helper(s, index + 1, current, result);

        current.deleteCharAt(current.length() - 1);
    }

    public List<String> getSubsequences(String s) {
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        helper(s, 0, current, result);

        return result;
    }
}

public class PowerSet {
    public static void main(String[] args) {
        String s = "abc";

        Solution sol = new Solution();
        List<String> subsequences = sol.getSubsequences(s);

        for (String subseq : subsequences) {
            System.out.println("\"" + subseq + "\"");
        }
    }
}
