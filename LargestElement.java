import java.util.Arrays;

class LargestElement {

    // Function to sort the array and return the largest element
    public static int findLargest(int[] arr) {
        // Sort the array in ascending order
        Arrays.sort(arr);

        // Return the last element (largest element)
        return arr[arr.length - 1];
    }
}

public class LargestElementInArray {

    public static void main(String[] args) {

        // Initialize arrays
        int[] arr1 = {2, 5, 1, 3, 0};
        int[] arr2 = {8, 10, 5, 7, 9};

        // Find and print the largest element
        System.out.println("The largest element in the array is: " + LargestElement.findLargest(arr1));
        System.out.println("The largest element in the array is: " + LargestElement.findLargest(arr2));
    }
}