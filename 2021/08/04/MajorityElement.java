/**
 * https://leetcode.com/problems/majority-element
 * @author Andrew Jarombek
 * @since 8/4/2021
 */

import java.util.HashMap;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int mode = -1;
        int mostOccurrences = 0;
        HashMap<Integer, Integer> occurrences = new HashMap<>();

        for (int num: nums) {
            Integer occurrence = occurrences.get(num);

            if (occurrence == null) {
                occurrence = 0;
            }

            if (occurrence + 1 > mostOccurrences) {
                mode = num;
                mostOccurrences = occurrence + 1;
            }

            occurrences.put(num, occurrence + 1);
        }

        return mode;
    }

    public static void main(String[] args) {
        assert majorityElement(new int[] {3, 2, 3}) == 3;
    }
}
