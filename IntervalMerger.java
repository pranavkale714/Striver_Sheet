import java.util.*;

class IntervalMerger {
    public List<List<Integer>> merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> merged = new ArrayList<>();

        for (int[] interval : intervals) {
            if (
                merged.isEmpty() ||
                merged.get(merged.size() - 1).get(1) < interval[0]
            ) {
                merged.add(Arrays.asList(interval[0], interval[1]));
            } else {
                int last = merged.size() - 1;
                int maxEnd = Math.max(
                    merged.get(last).get(1),
                    interval[1]
                );
                merged.get(last).set(1, maxEnd);
            }
        }

        return merged;
    }
}

class App {
    public static void main(String[] args) {
        IntervalMerger merger = new IntervalMerger();

        int[][] intervals = {
            {1, 3}, {2, 6}, {8, 10}, {15, 18}
        };

        List<List<Integer>> result = merger.merge(intervals);

        for (List<Integer> interval : result) {
            System.out.print(
                "[" + interval.get(0) + "," + interval.get(1) + "] "
            );
        }
    }
}
