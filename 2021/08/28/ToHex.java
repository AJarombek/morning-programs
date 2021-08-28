/**
 * https://leetcode.com/problems/convert-a-number-to-hexadecimal/
 * @author Andrew Jarombek
 * @since 8/28/2021
 */

import java.util.HashMap;
import java.util.Map;

public class ToHex {
    public static String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        long number = num < 0 ? ((long) Math.pow(2, 32)) + num : num;

        Map<Integer, String> hexMap = new HashMap<>();
        hexMap.put(10, "a");
        hexMap.put(11, "b");
        hexMap.put(12, "c");
        hexMap.put(13, "d");
        hexMap.put(14, "e");
        hexMap.put(15, "f");

        StringBuilder result = new StringBuilder();

        while (number > 0) {
            int current = (int) (number % 16);

            if (current < 10) {
                result.insert(0, current);
            } else {
                result.insert(0, hexMap.get(current));
            }

            number /= 16;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        assert toHex(16).equals("10");
    }
}
