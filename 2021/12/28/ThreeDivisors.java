/**
 * https://leetcode.com/problems/three-divisors/
 * @author Andrew Jarombek
 * @since 12/28/2021
 */

public class ThreeDivisors {
    public boolean isThree(int n) {
        int divisors = 1;
        int i = 2;

        while (i <= n && divisors < 4) {
            if (n % i == 0) {
                divisors++;
            }

            i++;
        }

        return divisors == 3;
    }
}
