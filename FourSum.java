import java.util.*;

class FourSum {
    public List<List<Integer>> findQuadruplets(int[] arr, int target) {
        int n = arr.length;
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                HashSet<Integer> seen = new HashSet<>();

                for (int k = j + 1; k < n; k++) {
                    long required = (long) target - arr[i] - arr[j] - arr[k];

                    if (seen.contains((int) required)) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], (int) required);
                        Collections.sort(temp);
                        set.add(temp);
                    }

                    seen.add(arr[k]);
                }
            }
        }
        return new ArrayList<>(set);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;

        FourSum obj = new FourSum();
        List<List<Integer>> ans = obj.findQuadruplets(arr, target);

        for (List<Integer> quad : ans) {
            System.out.println(quad);
        }
    }
}
