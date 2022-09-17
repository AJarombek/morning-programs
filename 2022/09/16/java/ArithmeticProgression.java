/*
 * https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
 * @author Andrew Jarombek
 * @since 9/16/2022
 */

import java.util.HashSet;
import java.util.Set;

public class ArithmeticProgression {
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int first = Math.min(arr[0], arr[1]);
        int second = Math.max(arr[0], arr[1]);
        set.add(first);
        set.add(second);

        for (int i = 2; i < arr.length; i++) {
            int val = arr[i];

            if (val <= first) {
                second = first;
                first = val;
            } else if (val < second) {
                second = val;
            }

            set.add(val);
        }

        if (set.size() != 1 && set.size() != arr.length)
            return false;

        int step = second - first;
        int expected = first;

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(expected))
                return false;

            expected += step;
        }

        return true;
    }

    public static void main(String[] args) {
        assert canMakeArithmeticProgression(new int[] {5, 1, 3});
        assert !canMakeArithmeticProgression(new int[] {5, 1, 4});
    }
}
