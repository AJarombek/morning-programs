/**
 * https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/
 * @author Andrew Jarombek
 * @since 11/19/2021
 */

public class GenerateString {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();

        int index = 0;

        if (n % 2 == 0) {
            sb.append('a');
            index++;
        }

        while (index < n) {
            sb.append('b');
            index++;
        }

        return sb.toString();
    }
}
