/**
 * https://leetcode.com/problems/distribute-candies/
 * @author Andrew Jarombek
 * @since 9/14/2021
 */

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> candyTypes = new HashSet<>();
        int uniqueCandies = 0;

        for (int candy: candyType) {
            if (!candyTypes.contains(candy)) {
                uniqueCandies++;
                candyTypes.add(candy);
            }
        }

        return Math.min(uniqueCandies, candyType.length / 2);
    }
}
