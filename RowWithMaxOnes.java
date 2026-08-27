class RowWithMaxOnes {

    public int lowerBound(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int rowWithMax1s(int[][] matrix, int n, int m) {
        int maxOnes = 0;
        int rowIndex = -1;

        for (int i = 0; i < n; i++) {
            int onesCount = m - lowerBound(matrix[i], m, 1);

            if (onesCount > maxOnes) {
                maxOnes = onesCount;
                rowIndex = i;
            }
        }

        return rowIndex;
    }
}

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {0, 0, 1},
            {0, 0, 0}
        };

        int n = 3, m = 3;

        RowWithMaxOnes obj = new RowWithMaxOnes();
        System.out.println("The row with maximum no. of 1's is: " + obj.rowWithMax1s(matrix, n, m));
    }
}
