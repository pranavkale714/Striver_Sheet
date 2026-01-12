import java.util.*;

public class Rversenumber {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int num = 123403;
        System.out.println(obj.revNumber(num));  
    }
}

class Solution {
     int revNumber(int n) {
        int revNum = 0;
        int temp;

        while (n > 0) {
            temp = n % 10;
            revNum = revNum * 10 + temp;
            n = n / 10;
        }

        return revNum;
    }
}
