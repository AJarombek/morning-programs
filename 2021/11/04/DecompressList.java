/**
 * https://leetcode.com/problems/decompress-run-length-encoded-list/
 * @author Andrew Jarombek
 * @since 11/4/2021
 */

import java.util.ArrayList;
import java.util.List;

public class DecompressList {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i - 1]; j++) {
                result.add(nums[i]);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
