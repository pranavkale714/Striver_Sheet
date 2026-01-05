import java.util.Scanner;

public class Digitcount {
  
    public static int countDigits(int n) {
       int cnt=0;
       while(n>0)
       {
           n=n/10;
           cnt++;
       }
        return cnt;
    }

    public static void main(String[] args) {
        int N = 329823;
        System.out.println("N: " + N);
        int digits = countDigits(N);
        System.out.println("Number of Digits in N: " + digits);
    }
}
