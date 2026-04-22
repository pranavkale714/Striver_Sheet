import java.util.*;

class ThreeSum {
    public List<List<Integer>> findTriplets(int[] arr, int n) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int left = i + 1, right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    ans.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;

                    while (left < right && arr[left] == arr[left - 1]) left++;
                    while (left < right && arr[right] == arr[right + 1]) right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        ThreeSum obj = new ThreeSum();
        List<List<Integer>> res = obj.findTriplets(arr, arr.length);

        for (List<Integer> triplet : res) {
            for (int num : triplet) System.out.print(num + " ");
            System.out.println();
        }
    }
}
