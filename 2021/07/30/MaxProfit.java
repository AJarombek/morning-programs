/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 * @author Andrew Jarombek
 * @since 7/30/2021
 */

public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int totalProfit = 0;
        int start = Integer.MAX_VALUE;
        int last = Integer.MIN_VALUE;

        for (int price: prices) {
            if (price >= start && price >= last) {
                last = price;
            } else {
                if (last != Integer.MIN_VALUE && last - start > 0) {
                    totalProfit += last - start;
                }

                start = price;
                last = Integer.MIN_VALUE;
            }
        }

        if (last != Integer.MIN_VALUE && last - start > 0) {
            totalProfit += last - start;
        }

        return totalProfit;
    }

    public static void main(String[] args) {
        assert maxProfit(new int[] {1, 2, 3, 4, 5}) == 4;
        assert maxProfit(new int[] {7, 1, 5, 3, 6, 4}) == 7;
    }
}
