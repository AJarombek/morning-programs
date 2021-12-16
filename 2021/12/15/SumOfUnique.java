/**
 * https://leetcode.com/problems/sum-of-unique-elements/
 * @author Andrew Jarombek
 * @since 12/15/2021
 */

import java.util.HashSet;
import java.util.Set;

public class SumOfUnique {
    public int sumOfUnique(int[] nums) {
        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> ineligibleElements = new HashSet<>();

        for (int num : nums) {
            if (!ineligibleElements.contains(num)) {
                if (uniqueElements.contains(num)) {
                    uniqueElements.remove(num);
                    ineligibleElements.add(num);
                } else {
                    uniqueElements.add(num);
                }
            }
        }

        int result = 0;
        for (int val : uniqueElements) {
            result += val;
        }

        return result;
    }
}
