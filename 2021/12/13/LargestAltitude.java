/**
 * https://leetcode.com/problems/find-the-highest-altitude/
 * @author Andrew Jarombek
 * @since 12/13/2021
 */

public class LargestAltitude {
    public int largestAltitude(int[] gain) {
        int largest = 0;
        int current = 0;

        for (int x : gain) {
            current += x;
            largest = Math.max(largest, current);
        }

        return largest;
    }
}
