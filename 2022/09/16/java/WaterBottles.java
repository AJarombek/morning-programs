/*
 * https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
 * @author Andrew Jarombek
 * @since 9/16/2022
 */

public class WaterBottles {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int result = 0;

        while (numBottles >= numExchange) {
            int quotient = numBottles / numExchange;
            int remainder = numBottles % numExchange;

            result += numBottles - remainder;
            numBottles = quotient + remainder;
        }

        return result + numBottles;
    }

    public static void main(String[] args) {
        assert numWaterBottles(9, 3) == 13;
        assert numWaterBottles(15, 4) == 19;
    }
}
