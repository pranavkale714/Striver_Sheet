import java.util.*;

class Freq_String_Counter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.next();

        System.out.println("You entered: " + s);

        // precompute:
        int[] hash = new int[256];
        System.out.println("\nCounting frequency of each character...");

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            hash[currentChar]++;

            System.out.println("Character: " + currentChar +
                    " | ASCII: " + (int) currentChar +
                    " | Updated Count: " + hash[currentChar]);
        }

        System.out.println("\nPrecomputation done!");

        System.out.println("\nEnter number of queries:");
        int q = sc.nextInt();

        while (q-- > 0) {

            System.out.println("\nEnter character to find frequency:");
            char c = sc.next().charAt(0);

            System.out.println("Character entered: " + c);
            System.out.println("ASCII value: " + (int) c);
            System.out.println("Frequency in string: " + hash[c]);
        }
    }
}
