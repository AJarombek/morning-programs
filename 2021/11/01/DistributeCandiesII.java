/**
 * https://leetcode.com/problems/distribute-candies-to-people/
 * @author Andrew Jarombek
 * @since 11/1/2021
 */

public class DistributeCandiesII {
    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int index = 0;
        int count = 1;

        while (candies > 0) {
            result[index] += candies - count >= 0 ? count : candies;

            candies -= count;
            count++;
            index = (index == num_people - 1) ? 0 : index + 1;
        }

        return result;
    }
}
