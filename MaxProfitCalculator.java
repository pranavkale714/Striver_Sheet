import java.util.*;

class MaxProfitCalculator {
    public int calculateMaxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }
}

class Main {
    public static void main(String[] args) {
        MaxProfitCalculator obj = new MaxProfitCalculator();
        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(obj.calculateMaxProfit(prices));
    }
}
