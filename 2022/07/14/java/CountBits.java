/**
 * https://leetcode.com/problems/counting-bits/
 * @author Andrew Jarombek
 * @since 7/14/2022
 */

public class CountBits {
    public static int[] countBits(int n) {
        int[] result = new int[n+1];

        for (int i = 0; i <= n; i++) {
            int ones = 0;
            int num = i;

            while (num > 0) {
                ones += num & 1;
                num >>= 1;
            }

            result[i] = ones;
        }

        return result;
    }

    public static void main(String[] args) {
        var result = countBits(4);

        assert result[0] == 0;
        assert result[1] == 1;
        assert result[2] == 1;
        assert result[3] == 2;
        assert result[4] == 1;
    }
}
