/**
 * https://leetcode.com/problems/detect-capital/
 * @author Andrew Jarombek
 * @since 9/8/2021
 */

import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        Pattern allUppercase = Pattern.compile("^[A-Z]+$");
        Pattern allLowercase = Pattern.compile("^[a-z]+$");
        Pattern capitalized = Pattern.compile("^[A-Z]{1}[a-z]+$");

        Matcher allUppercaseMatcher = allUppercase.matcher(word);
        Matcher allLowercaseMatcher = allLowercase.matcher(word);
        Matcher capitalizedMatcher = capitalized.matcher(word);

        return allUppercaseMatcher.matches() || allLowercaseMatcher.matches() || capitalizedMatcher.matches();
    }

    public static boolean detectCapitalUseNoRegex(String word) {
        if (word.length() == 1) {
            return true;
        }

        List<Character> upperCharsList = List.of('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z');
        HashSet<Character> upperChars = new HashSet<>(upperCharsList);

        boolean capitalized = upperChars.contains(word.charAt(0));
        boolean uppercase = capitalized && upperChars.contains(word.charAt(1));

        if (!capitalized && upperChars.contains(word.charAt(1))) {
            return false;
        }

        for (int i = 2; i < word.length(); i++) {
            if (upperChars.contains(word.charAt(i)) && !uppercase) {
                return false;
            }

            if (!upperChars.contains(word.charAt(i)) && uppercase) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        assert detectCapitalUse("HELLO");
        assert detectCapitalUse("hello");
        assert detectCapitalUse("Hello");
        assert !detectCapitalUse("HeLlo");
    }
}

// You are beautiful the way you are
