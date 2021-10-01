/**
 * https://leetcode.com/problems/binary-search/
 * @author Andrew Jarombek
 * @since 10/1/2021
 */

public class BinarySearch {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        int mid = high / 2;

        while (low < high) {
            int val = nums[mid];
            if (target < val) {
                high = mid;
            } else if (val == target) {
                return mid;
            } else {
                low = mid + 1;
            }

            mid = (high + low) / 2;
        }

        return -1;
    }
}
