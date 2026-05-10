import java.util.*;

class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(Collections.nCopies(i + 1, 1));

            for (int j = 1; j < i; j++) {
                row.set(j, triangle.get(i - 1).get(j - 1) +
                           triangle.get(i - 1).get(j));
            }

            triangle.add(row);
        }
        return triangle;
    }
}

public class Main {
    public static void main(String[] args) {
        PascalsTriangle obj = new PascalsTriangle();
        int n = 5;

        List<List<Integer>> result = obj.generate(n);
        for (List<Integer> row : result) {
            for (Integer val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
