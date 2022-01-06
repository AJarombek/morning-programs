/**
 * https://leetcode.com/problems/time-needed-to-buy-tickets/
 * @author Andrew Jarombek
 * @since 1/5/2022
 */

public class TimeRequiredToBuy {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int kth = tickets[k];
        int result = 0;

        for (int i = 0; i <= k; i++) {
            result += Math.min(kth, tickets[i]);
        }

        for (int i = k + 1; i < tickets.length; i++) {
            result += Math.min(kth - 1, tickets[i]);
        }

        return result;
    }
}
