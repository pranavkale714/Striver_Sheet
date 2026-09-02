class Solution {
    static final long MOD = 1000000007;

    private long power(long x, long n) {
        long result = 1;

        while (n > 0) {
            if (n % 2 == 1) {
                result = (result * x) % MOD;
            }

            x = (x * x) % MOD;
            n /= 2;
        }

        return result;
    }

    public int countGoodNumbers(long n) {
        long evenPositions = (n + 1) / 2;
        long oddPositions = n / 2;

        long evenWays = power(5, evenPositions);
        long oddWays = power(4, oddPositions);

        return (int) ((evenWays * oddWays) % MOD);
    }
}

public class CountGoodNumbers {
    public static void main(String[] args) {
        Solution obj = new Solution();

        long n = 4;

        System.out.println(obj.countGoodNumbers(n));
    }
}
