/**
 * https://leetcode.com/problems/sort-array-by-parity/
 * @author Andrew Jarombek
 * @since 10/14/2021
 */

public class SortArrayParity {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            if (nums[start] % 2 == 0) {
                start++;
            } else {
                while (end >= start) {
                    if (nums[end] % 2 == 0) {
                        int temp = nums[start];
                        nums[start] = nums[end];
                        nums[end] = temp;

                        start++;
                        end--;
                        break;
                    } else {
                        end--;
                    }
                }
            }
        }

        return nums;
    }
}
