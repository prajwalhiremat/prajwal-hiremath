import java.util.*;
public class BestTimeToBuySellStock {
    public int maxProfit(int[] prices) {
        int minimum = Integer.MAX_VALUE;
        int profit = 0;
        for (int price : prices) {
            minimum = Math.min(minimum, price);
            profit = Math.max(profit, price - minimum);
        }
        return profit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) prices[i] = sc.nextInt();
        System.out.println(new BestTimeToBuySellStock().maxProfit(prices));
    }
}
