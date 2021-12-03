/**
 * https://leetcode.com/problems/detect-pattern-of-length-m-repeated-k-or-more-times/
 * @author Andrew Jarombek
 * @since 12/2/2021
 */

public class DetectPattern {
    public boolean containsPattern(int[] arr, int m, int k) {
        for (int i = 0; i <= arr.length - (k * m); i++) {
            int index = 1;
            boolean valid = true;

            while (index < k && valid) {
                for (int j = 0; j < m; j++) {
                    if (arr[i + j] != arr[i + j + (m * index)]) {
                        valid = false;
                        break;
                    }
                }

                if (valid)
                    index++;
            }

            if (index == k) {
                return true;
            }
        }

        return false;
    }
}
