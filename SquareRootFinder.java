import java.util.*;

class SquareRootFinder {
    public int findSqrt(int n) {
        if (n < 2) return n;

        int low = 1, high = n / 2, ans = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (mid * mid <= n) {
                ans = (int) mid;
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }

        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        SquareRootFinder s = new SquareRootFinder();
        System.out.println(s.findSqrt(8));
    }
}
