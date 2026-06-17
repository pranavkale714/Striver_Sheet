import java.util.*;

class LongestCommonPrefix {

    public String longestCommonPrefix(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }

        Arrays.sort(str);

        String first = str[0];
        String last = str[str.length - 1];

        StringBuilder ans = new StringBuilder();

        int minLength = Math.min(first.length(), last.length());

        for (int i = 0; i < minLength; i++) {
            if (first.charAt(i) != last.charAt(i)) {
                break;
            }
            ans.append(first.charAt(i));
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();

        String[] input = {"interview", "internet", "internal", "interval"};

        String result = solution.longestCommonPrefix(input);

        System.out.println("Longest Common Prefix: " + result);
    }
}
