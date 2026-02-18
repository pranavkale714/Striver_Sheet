import java.util.*;

class SumCalculator {
    public int sumOfNaturalNumbers(int N) {
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        SumCalculator obj = new SumCalculator();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int result = obj.sumOfNaturalNumbers(N);

        System.out.println(result);

        sc.close();
    }
}
