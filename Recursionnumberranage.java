class Recursionnumberranage {
    // Recursive function to print numbers from current to n
    public void printNumbers(int current, int n) {
        // Base case: if current exceeds n, stop recursion
        if (current > n)
            return;

        // Print current number
        System.out.print(current + " ");

        // Recursive call with next number
        printNumbers(current + 1, n);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10;

        sol.printNumbers(1, n);
        System.out.println();
    }
}
