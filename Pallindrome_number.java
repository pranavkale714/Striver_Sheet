import java.util.*;

public class Pallindrome_number {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int num1 = 1221;
        System.out.println(obj.reverseNumber(num1));  
    }
}

class Solution {
       String reverseNumber(int x) {
        int orgno=x;
        int revNum = 0;
        int temp;

        while (x > 0) {
            temp = x % 10;
            revNum = revNum * 10 + temp;
            x = x / 10;
        }
        if(revNum==orgno)
        {
            return "pal";
        }
        else
        {
            return "not";
        }
        
    }
}
