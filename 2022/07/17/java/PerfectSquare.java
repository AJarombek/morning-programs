/**
 * https://leetcode.com/problems/valid-perfect-square/
 * @author Andrew Jarombek
 * @since 7/17/2022
 */

public class PerfectSquare {
    public static boolean isPerfectSquare(int num) {
        long val = 1;

        while (val * val < num) {
            val++;
        }

        return val * val == num;
    }

    public static boolean isPerfectSquareBinarySearch(int num) {
        if (num == 1)
            return true;

        int low = 0;
        int high = num / 2;

        while (low <= high) {
            long mid = (low + high) / 2;
            long val = mid * mid;

            if (val == num) {
                return true;
            } else if (val < num) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        assert isPerfectSquare(16);
        assert !isPerfectSquare(14);

        assert isPerfectSquareBinarySearch(16);
        assert !isPerfectSquareBinarySearch(14);
    }
}
