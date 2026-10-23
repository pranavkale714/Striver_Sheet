import java.util.*;

class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> ans = new ArrayList<>();
        solve(num, target, 0, 0, 0, "", ans);
        return ans;
    }

    private void solve(String num, int target, int index,
                       long value, long lastOperand,
                       String expr, List<String> ans) {

        if (index == num.length()) {
            if (value == target) {
                ans.add(expr);
            }
            return;
        }

        for (int i = index; i < num.length(); i++) {

            // Avoid operands with leading zeros
            if (i > index && num.charAt(index) == '0') {
                break;
            }

            String part = num.substring(index, i + 1);
            long curr = Long.parseLong(part);

            if (index == 0) {
                solve(num, target, i + 1, curr, curr,
                      part, ans);
            } else {
                // Addition
                solve(num, target, i + 1,
                      value + curr, curr,
                      expr + "+" + part, ans);

                // Subtraction
                solve(num, target, i + 1,
                      value - curr, -curr,
                      expr + "-" + part, ans);

                // Multiplication: handle operator precedence
                solve(num, target, i + 1,
                      value - lastOperand + lastOperand * curr,
                      lastOperand * curr,
                      expr + "*" + part, ans);
            }
        }
    }
}
