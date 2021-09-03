/**
 * https://leetcode.com/problems/number-complement/
 * @author Andrew Jarombek
 * @since 9/3/2021
 */

public class NumberComplement {
    public static int findComplement(int num) {
        String binary = Integer.toString(num, 2);

        int result = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '0') {
                result += Math.pow(2, Math.abs(binary.length() - i - 1));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        assert findComplement(5) == 2;
    }
}
