package other;

/**
 * 122. Best Time to Buy and Sell Stock II
 * Complexity
 * Time Complexity: O(n) - Each prices computed at least once
 * Space Complexity: O(1) - no new data structures are used except the constants
 */
public class BuyAndsell2 {

    private static int buySell(int[] prices) {
        int start = prices[0];
        int max = 0;
        for(int i = 1; i < prices.length; i++) {
            if(start < prices[i]) {
                max += prices[i] - start;
            }
            start = prices[i];
        }
        return max;
    }

    private static int buySell2(int[] prices) {
        int profit = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        System.out.println(buySell(new int[]{1, 2, 3, 4, 5}));
        System.out.println(buySell(new int[]{1, 2, 3, 4, 5}));
    }
}
