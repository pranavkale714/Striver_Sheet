import java.util.*;

class NextPermutation {

    public void findNextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        NextPermutation obj = new NextPermutation();
        obj.findNextPermutation(nums);

        for (int x : nums) {
            System.out.print(x + " ");
        }
    }
}
