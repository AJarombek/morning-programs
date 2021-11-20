/**
 * https://leetcode.com/problems/create-target-array-in-the-given-order/
 * @author Andrew Jarombek
 * @since 11/20/2021
 */

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArray {
    public int[] createTargetArrayFaster(int[] nums, int[] index) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < index.length; i++) {
            result.add(index[i], nums[i]);
        }

        int[] resultArray = new int[result.size()];

        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < index.length; i++) {
            result.add(index[i], nums[i]);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
