/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * @author Andrew Jarombek
 * @since 8/3/2021
 */

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (sum == target) {
                    return new int[] {i+1, j+1};
                }

                if (sum > target) {
                    break;
                }
            }
        }

        return new int[] {};
    }

    public int[] twoSumSolutionTwo(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while (start != end) {
            int sum = numbers[start] + numbers[end];
            if (sum == target) {
                return new int[] {start+1, end+1};
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }

        return new int[] {};
    }
}
