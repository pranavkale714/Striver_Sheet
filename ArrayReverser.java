import java.util.*;

class ArrayReverser {

    public static void reverse(List<Integer> list) {
        Collections.reverse(list);
    }
}

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        ArrayReverser.reverse(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
