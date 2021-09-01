/**
 * https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
 * @author Andrew Jarombek
 * @since 9/1/2021
 */

public class MinMoves {
    public static int minMoves(int[] nums) {
        int min = nums[0];
        for (int num: nums) {
            min = Math.min(min, num);
        }

        int moves = 0;
        for (int num: nums) {
            moves += num - min;
        }

        return moves;
    }

    public static void main(String[] args) {
        assert minMoves(new int[] {1, 2, 3}) == 3;
    }
}
