import java.util.Arrays;

class TwoSumSolver {

    public String exists(int[] arr, int target) {
        int n = arr.length;

        int[][] numsWithIndex = new int[n][2];

        for (int i = 0; i < n; i++) {
            numsWithIndex[i][0] = arr[i];
            numsWithIndex[i][1] = i;
        }

        Arrays.sort(numsWithIndex, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0, right = n - 1;

        while (left < right) {
            int sum = numsWithIndex[left][0] + numsWithIndex[right][0];

            if (sum == target) {
                return "YES";
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return "NO";
    }

    public int[] getIndices(int[] arr, int target) {
        int n = arr.length;

        int[][] numsWithIndex = new int[n][2];

        for (int i = 0; i < n; i++) {
            numsWithIndex[i][0] = arr[i];
            numsWithIndex[i][1] = i;
        }

        Arrays.sort(numsWithIndex, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0, right = n - 1;

        while (left < right) {
            int sum = numsWithIndex[left][0] + numsWithIndex[right][0];

            if (sum == target) {
                return new int[]{numsWithIndex[left][1], numsWithIndex[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }
}

public class Main {
    public static void main(String[] args) {
        TwoSumSolver solver = new TwoSumSolver();

        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;

        System.out.println(solver.exists(arr, target));

        int[] res = solver.getIndices(arr, target);
        System.out.println("[" + res[0] + ", " + res[1] + "]");
    }
}
