/**
 * https://leetcode.com/problems/kth-missing-positive-number/
 * @author Andrew Jarombek
 * @since 9/1/2022
 */

public class KthPositive {
    public static int findKthPositive(int[] arr, int k) {
        int expected = 1;
        int missing = 0;

        for (int val : arr) {
            if (expected != val) {
                int updatedMissing = missing + val - expected;

                if (updatedMissing >= k) {
                    return expected + k - missing - 1;
                }

                missing = updatedMissing;
            }

            expected = val + 1;
        }

        return expected + k - missing - 1;
    }

    public static void main(String[] args) {
        assert findKthPositive(new int[] {2,3,4,7,11}, 5) == 9;
        assert findKthPositive(new int[] {1,2,3,4}, 2) == 6;
    }
}
