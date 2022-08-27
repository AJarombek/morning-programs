/**
 * https://leetcode.com/problems/calculate-money-in-leetcode-bank/
 * @author Andrew Jarombek
 * @since 8/27/2022
 */

public class TotalMoney {
    public static int totalMoney(int n) {
        int result = 1;
        int deposit = 1;

        for (int i = 1; i < n; i++) {
            if (i % 7 == 0)
                deposit -= 6;

            deposit++;
            result += deposit;
        }

        return result;
    }

    public static void main(String[] args) {
        assert totalMoney(4) == 10;
        assert totalMoney(10) == 37;
        assert totalMoney(20) == 96;
    }
}
