import java.util.*;

class Solution {
    static void generate(int n, String curr, List<String> result) {
        // Base case: if length is n, add to result
        if (curr.length() == n) {
            result.add(curr);
            return;
        }

        // Always try adding '0'
        generate(n, curr + "0", result);

        // Add '1' only if previous char is not '1'
        if (curr.isEmpty() || curr.charAt(curr.length() - 1) != '1') {
            generate(n, curr + "1", result);
        }
    }
}

public class GenerateBinaryStrings {
    public static void main(String[] args) {
        int n = 3;

        List<String> result = new ArrayList<>();

        Solution.generate(n, "", result);

        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
