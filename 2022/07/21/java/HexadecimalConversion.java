/**
 * https://leetcode.com/problems/convert-a-number-to-hexadecimal/
 * @author Andrew Jarombek
 * @since 7/21/2022
 */

public class HexadecimalConversion {
    public static String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        long n = num;

        if (num < 0) {
            n = ((long) Integer.MAX_VALUE << 1) + 2;
            n += num;
        }

        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int val = (int) (n % 16);

            if (val < 10) {
                sb.append((char) ('0' + val));
            } else {
                sb.append((char) ('a' + val - 10));
            }

            n /= 16;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        assert toHex(16).equals("10");
        assert toHex(-1).equals("ffffffff");
    }
}
