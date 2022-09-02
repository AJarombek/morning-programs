/**
 * https://leetcode.com/problems/thousand-separator/
 * @author Andrew Jarombek
 * @since 9/1/2022
 */

public class ThousandSeparator {
    public static String thousandSeparator(int n) {
        if (n == 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (n > 0) {
            if (i > 0 && i % 3 == 0) {
                sb.append(".");
            }

            sb.append(n % 10);
            n /= 10;
            i++;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        assert thousandSeparator(123).equals("123");
        assert thousandSeparator(1234).equals("1.234");
    }
}
