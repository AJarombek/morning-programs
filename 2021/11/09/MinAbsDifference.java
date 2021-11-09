/**
 * https://leetcode.com/problems/minimum-absolute-difference/
 * @author Andrew Jarombek
 * @since 11/9/2021
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinAbsDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        int prev = arr[0];
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];

            if (current - prev < minDiff) {
                minDiff = current - prev;
                result = new ArrayList<>();
                this.addPair(result, prev, current);
            } else if (current - prev == minDiff) {
                this.addPair(result, prev, current);
            }

            prev = current;
        }

        return result;
    }

    private void addPair(List<List<Integer>> result, int prev, int current) {
        List<Integer> pair = new ArrayList<>();
        pair.add(prev);
        pair.add(current);
        result.add(pair);
    }
}
