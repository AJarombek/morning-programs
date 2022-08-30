/*
 * https://leetcode.com/problems/defuse-the-bomb/
 * @author Andrew Jarombek
 * @since 8/29/2022
 */

import java.util.Arrays;

public class Decrypt {
    public static int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];

        if (k == 0) {
            return result;
        }

        int sum = 0;

        if (k > 0) {
            for (int i = 1; i <= k; i++) {
                sum += code[i];
            }

            for (int i = 0; i < code.length; i++) {
                result[i] = sum;
                sum -= code[(i + 1) % code.length];
                sum += code[(i + k + 1) % code.length];
            }
        } else {
            k = -k;
            for (int i = code.length - 2; i >= code.length - 1 - k; i--) {
                sum += code[i];
            }

            for (int i = code.length - 1; i >= 0; i--) {
                result[i] = sum;
                sum -= code[(code.length + (i - 1)) % code.length];
                sum += code[(code.length + (i - k - 1)) % code.length];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] expected = new int[] {12, 10, 16, 13};
        int[] result = decrypt(new int[] {5, 7, 1, 4}, 3);
        assert Arrays.equals(expected, result);

        expected = new int[] {0, 0, 0, 0};
        result = decrypt(new int[] {1, 2, 3, 4}, 0);
        assert Arrays.equals(expected, result);

        expected = new int[] {12, 5, 6, 13};
        result = decrypt(new int[] {2, 4, 9, 3}, -2);
        assert Arrays.equals(expected, result);
    }
}
