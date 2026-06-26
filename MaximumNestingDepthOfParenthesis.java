class MaximumNestingDepthOfParenthesis {
    public int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(')
                depth++;
            else if (ch == ')')
                depth--;

            maxDepth = Math.max(maxDepth, depth);
        }

        return maxDepth;
    }
}

class MaximumNestingDepthDemo {
    public static void main(String[] args) {
        MaximumNestingDepthOfParenthesis obj = new MaximumNestingDepthOfParenthesis();

        String s = "(1+(2*3)+((8)/4))+1";

        System.out.println(obj.maxDepth(s));
    }
}
