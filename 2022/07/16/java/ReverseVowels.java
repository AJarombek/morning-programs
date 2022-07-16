/**
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 * @author Andrew Jarombek
 * @since 7/16/2022
 */

import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {
    public static String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            while (start < end && !vowels.contains(chars[start])) {
                start++;
            }

            while (start < end && !vowels.contains(chars[end])) {
                end--;
            }

            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        assert reverseVowels("hello").equals("holle");
    }
}
