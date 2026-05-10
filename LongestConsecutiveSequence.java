import java.util.*;

class LongestConsecutiveSequence {
    
    public int findLongestConsecutive(int[] nums) {
        int n = nums.length;

        if (n == 0) return 0;

        Arrays.sort(nums);

        int last = Integer.MIN_VALUE;
        int currentLength = 0;
        int maxLength = 1;

        for (int i = 0; i < n; i++) {

            if (nums[i] - 1 == last) {
                currentLength++;
                last = nums[i];
            } 
            else if (nums[i] != last) {
                currentLength = 1;
                last = nums[i];
            }

            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};

        LongestConsecutiveSequence obj = new LongestConsecutiveSequence();
        int result = obj.findLongestConsecutive(arr);

        System.out.println("Longest consecutive sequence length: " + result);
    }
}
