import java.util.*;

class MajorityElements {
    public List<Integer> findMajority(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> mpp = new HashMap<>();
        int mini = n / 3 + 1;

        for (int i = 0; i < n; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);

            if (mpp.get(nums[i]) == mini) {
                result.add(nums[i]);
            }

            if (result.size() == 2) break;
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {11, 33, 33, 11, 33, 11};

        MajorityElements obj = new MajorityElements();
        List<Integer> ans = obj.findMajority(arr);

        System.out.print("The majority elements are: ");
        for (int it : ans) {
            System.out.print(it + " ");
        }
        System.out.println();
    }
}
