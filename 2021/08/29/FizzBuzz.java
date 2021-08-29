/**
 * https://leetcode.com/problems/fizz-buzz/
 * @author Andrew Jarombek
 * @since 8/29/2021
 */

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> result = fizzBuzz(5);
        assert result.get(0).equals("1");
        assert result.get(1).equals("2");
        assert result.get(2).equals("Fizz");
        assert result.get(3).equals("4");
        assert result.get(4).equals("Buzz");
    }
}
