import java.util.*;

class RotationCountFinder {

    public int findRotations(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        RotationCountFinder finder = new RotationCountFinder();

        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};

        int rotations = finder.findRotations(arr);

        System.out.println("Array is rotated " + rotations + " times");
    }
}
