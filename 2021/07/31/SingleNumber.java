/**
 * https://leetcode.com/problems/single-number/
 * @author Andrew Jarombek
 * @since 7/31/2021
 */

import java.util.HashSet;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        HashSet<Integer> appearsOnce = new HashSet<>();
        HashSet<Integer> appearsTwice = new HashSet<>();

        for (int num: nums) {
            if (appearsOnce.contains(num)) {
                appearsOnce.remove(num);
                appearsTwice.add(num);
            } else {
                appearsOnce.add(num);
            }
        }

        for (int result: appearsOnce) {
            return result;
        }

        return 0;
    }

    public static void main(String[] args) {
        assert singleNumber(new int[] {2, 2, 1}) == 1;
    }
}
