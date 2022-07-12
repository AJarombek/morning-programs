/**
 * https://leetcode.com/problems/add-digits
 * @author Andrew Jarombek
 * @since 7/11/2022
 */

public class AddDigits {
    public int addDigits(int num) {
        while (num > 9) {
            int val = num;
            int next = 0;

            while (val > 9) {
                next += val % 10;
                val /= 10;
            }

            next += val;
            num = next;
        }

        return num;
    }

    public static void main(String[] args) {
        var program = new AddDigits();
        assert program.addDigits(12) == 3;
        assert program.addDigits(1) == 1;
    }
}
