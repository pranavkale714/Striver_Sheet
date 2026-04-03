import java.util.*;

class MajorityElementFinder {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        int el = 0;

        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = nums[i];
            } else if (el == nums[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }

        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el) {
                cnt1++;
            }
        }

        if (cnt1 > (n / 2)) {
            return el;
        }

        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        MajorityElementFinder sol = new MajorityElementFinder();
        int ans = sol.majorityElement(arr);

        System.out.println("The majority element is: " + ans);
    }
}