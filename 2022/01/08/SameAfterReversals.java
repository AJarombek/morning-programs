/**
 * https://leetcode.com/problems/a-number-after-a-double-reversal/
 * @author Andrew Jarombek
 * @since 1/8/2022
 */

public class SameAfterReversals {
    public boolean isSameAfterReversals(int num) {
        if (num == 0)
            return true;

        return num % 10 != 0;
    }
}
