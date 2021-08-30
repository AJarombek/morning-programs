/**
 * https://leetcode.com/problems/third-maximum-number/
 * @author Andrew Jarombek
 * @since 8/30/2021
 */

import java.util.HashSet;
import java.util.Set;

public class ThirdMax {
    public static int thirdMax(int[] nums) {
        Set<Integer> usedNumbers = new HashSet<>();
        Integer largest = null;
        Integer second = null;
        Integer third = null;

        for (int num: nums) {
            if (!usedNumbers.contains(num)) {
                usedNumbers.add(num);

                if (largest == null || num > largest) {
                    third = second;
                    second = largest;
                    largest = num;
                } else if (second == null || num > second) {
                    third = second;
                    second = num;
                } else if (third == null || num > third) {
                    third = num;
                }
            }
        }

        return third == null ? largest : third;
    }

    public static void main(String[] args) {
        assert thirdMax(new int[] {1, 2, 3}) == 1;
        assert thirdMax(new int[] {1, 2}) == 2;
        assert thirdMax(new int[] {1, 2, 2, 3}) == 1;
    }
}
