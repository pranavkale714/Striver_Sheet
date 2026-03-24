import java.util.*;

class MoveZerosToEnd {
    public void moveZeroes(int[] nums) {
        int j = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) return;

        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MoveZerosToEnd sol = new MoveZerosToEnd();
        int[] nums = {0, 1, 0, 3, 12};
        sol.moveZeroes(nums);

        for (int num : nums)
            System.out.print(num + " ");
    }
}