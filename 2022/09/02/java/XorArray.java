/**
 * https://leetcode.com/problems/xor-operation-in-an-array/
 * @author Andrew Jarombek
 * @since 9/2/2022
 */

public class XorArray {
    public static int xorOperation(int n, int start) {
        int result = start;
        int current = start;
        int index = 1;

        while (index < n) {
            current += 2;
            result ^= current;
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        assert xorOperation(5, 0) == 8;
        assert xorOperation(4, 3) == 8;
    }
}
