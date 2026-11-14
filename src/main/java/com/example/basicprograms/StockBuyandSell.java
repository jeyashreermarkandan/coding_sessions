package com.example.basicprograms;

public class StockBuyandSell {
    public static int maximumProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }

        int lowestPrice = prices[0];
        int maximumProfit = 0;

        for (int day = 1; day < prices.length; day++) {
            int profit = prices[day] - lowestPrice;
            maximumProfit = Math.max(maximumProfit, profit);
            lowestPrice = Math.min(lowestPrice, prices[day]);
        }

        return maximumProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maximumProfit(prices));
    }
}
