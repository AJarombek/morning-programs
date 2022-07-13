/**
 * https://leetcode.com/problems/move-zeroes
 * @author Andrew Jarombek
 * @since 7/12/2022
 */

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;

        while (j < nums.length) {
            int val = nums[j];
            j++;

            if (val != 0) {
                nums[i] = val;
                i++;
            }
        }

        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {0, 1, 0, 2, 3};
        moveZeroes(nums);

        assert nums[0] == 1;
        assert nums[1] == 2;
        assert nums[2] == 3;
        assert nums[3] == 0;
        assert nums[4] == 0;
    }
}
