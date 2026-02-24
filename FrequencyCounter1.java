package practice;
import java.util.*;

public class FrequencyCounter1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements (values between 0 and 12 only):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // frequemcy array
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        System.out.println("Enter number of queries:");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter number to find its frequency:");
            int number = sc.nextInt();

            System.out.println("Frequency of " + number + " is: " + hash[number]);
        }

        sc.close();
    }
}
