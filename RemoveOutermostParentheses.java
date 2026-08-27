class RemoveOutermostParentheses {

    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (count > 0) {
                    ans.append(ch);
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    ans.append(ch);
                }
            }
        }

        return ans.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        String s = "(()())(())";

        RemoveOutermostParentheses obj = new RemoveOutermostParentheses();
        String result = obj.removeOuterParentheses(s);

        System.out.println(result);
    }
}
