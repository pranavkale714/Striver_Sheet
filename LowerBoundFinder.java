import java.util.*;

class LowerBoundFinder {

    public int lowerBound(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= x) {
                return i;
            }
        }
        return arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
    }
}