import java.util.*;

public class RearrangeArrayBySign {

    public int[] rearrange(int[] A) {
        int n = A.length;
        int[] ans = new int[n];

        int posIndex = 0, negIndex = 1;

        for (int i = 0; i < n; i++) {
            if (A[i] < 0) {
                ans[negIndex] = A[i];
                negIndex += 2;
            } else {
                ans[posIndex] = A[i];
                posIndex += 2;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, -4, -5};

        RearrangeArrayBySign obj = new RearrangeArrayBySign();
        int[] result = obj.rearrange(A);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}