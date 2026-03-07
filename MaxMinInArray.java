import java.util.*;

class MaxMinInArray {

    public void findMaxMin(int[] arr) {

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }

    public static void main(String[] args) {

        MaxMinInArray obj = new MaxMinInArray();
        int[] arr = {10, 5, 10, 15, 10, 5};

        obj.findMaxMin(arr);
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 84129411872a9a6fb59019a1cb7c9ff3965bd978
