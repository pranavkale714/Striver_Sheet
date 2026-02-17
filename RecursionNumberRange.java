class RecursionNumberRange {
    public void printRange(int start, int end) {
        if (start > end)
            return;

        System.out.print(start + " ");
        printRange(start + 1, end);
    }
}

public class Main {
    public static void main(String[] args) {
        NumberRangePrinter printer = new NumberRangePrinter();
        printer.printRange(1, 10);
    }
}
