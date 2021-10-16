/**
 * https://leetcode.com/problems/sort-array-by-parity-ii/
 * @author Andrew Jarombek
 * @since 10/16/2021
 */

public class SortArrayParityII {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        int j = 1;

        while (i < nums.length) {
            int x = nums[i];

            if (x % 2 == 1) {
                while (j < nums.length) {
                    int y = nums[j];

                    if (y % 2 == 0) {
                        nums[i] = y;
                        nums[j] = x;
                        j += 2;
                        break;
                    } else {
                        j+= 2;
                    }
                }
            }

            i += 2;
        }

        return nums;
    }
}
