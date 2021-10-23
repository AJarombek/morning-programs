/**
 * https://leetcode.com/problems/add-to-array-form-of-integer/
 * @author Andrew Jarombek
 * @since 10/23/2021
 */

import java.util.LinkedList;
import java.util.List;

public class AddToArrayForm {
    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> list = new LinkedList<>();
        int index = num.length - 1;
        int remainder = 0;

        while (index >= 0 || k > 0 || remainder > 0) {
            int value = remainder + (k % 10);
            value += index >= 0 ? num[index] : 0;

            list.add(0, value % 10);

            remainder = value / 10;
            index--;
            k /= 10;
        }

        return list;
    }

    // This works for smaller numbers.
    public List<Integer> addToArrayFormV1(int[] num, int k) {
        long j = 0;

        for (int i = 0; i < num.length; i++) {
            j *= 10;
            j += num[i];
        }

        j += k;

        List<Integer> list = new LinkedList<>();

        if (j == 0) {
            list.add(0);
            return list;
        }

        while (j > 0) {
            list.add(0, (int) (j % 10));
            j /= 10;
        }

        return list;
    }
}
