/**
 * https://leetcode.com/problems/number-of-1-bits/
 * @author Andrew Jarombek
 * @since 8/6/2021
 */

public class HammingWeight {
    public static int hammingWeight(int n) {
        String binaryStr = Integer.toBinaryString(n);

        int count = 0;

        char[] chars = binaryStr.toCharArray();
        for (char c: chars) {
            if (c == '1') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        assert hammingWeight(11) == 3;
    }
}
