import java.util.*;

class SortedArrayUnion {

    public List<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        List<Integer> union = new ArrayList<>();

        int i = 0, j = 0;

        while (i < n && j < m) {

            if (arr1[i] <= arr2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < n) {
            if (union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        while (j < m) {
            if (union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }

    public static void main(String[] args) {
        SortedArrayUnion obj = new SortedArrayUnion();

        int[] arr1 = {1, 2, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5, 6};

        List<Integer> result = obj.findUnion(arr1, arr2, arr1.length, arr2.length);

        System.out.println(result);
    }
}