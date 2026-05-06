class MaxProductSubarray {

    public int findMaxProduct(int[] arr) {
        int n = arr.length;

        int prefix = 1, suffix = 1;
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;

            prefix *= arr[i];
            suffix *= arr[n - i - 1];

            maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));
        }

        return maxProduct;
    }
}

public class App {
    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};

        MaxProductSubarray obj = new MaxProductSubarray();
        System.out.println(obj.findMaxProduct(arr));
    }
}
