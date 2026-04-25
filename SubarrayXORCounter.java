import java.util.*;

class SubarrayXORCounter {
    public int countSubarraysXOR(int[] A, int B) {
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            int xorVal = 0;

            for (int j = i; j < A.length; j++) {
                xorVal ^= A[j];

                if (xorVal == B) {
                    count++;
                }
            }
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] A = {4, 2, 2, 6, 4};
        int B = 6;

        SubarrayXORCounter sol = new SubarrayXORCounter();
        System.out.println(sol.countSubarraysXOR(A, B));
    }
}
