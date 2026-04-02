import java.util.*;

class SortZeroOneTwo {

    public void sort(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        SortZeroOneTwo obj = new SortZeroOneTwo();
        int[] nums = {2, 0, 2, 1, 1, 0};

        obj.sort(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}