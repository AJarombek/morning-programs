/*
 * https://leetcode.com/problems/rearrange-spaces-between-words/
 * @author Andrew Jarombek
 * @since 8/30/2022
 */

import java.util.ArrayList;
import java.util.List;

public class ReorderSpaces {
    public static String reorderSpaces(String text) {
        int spaces = 0;

        for (char c : text.toCharArray()) {
            if (c == ' ') {
                spaces++;
            }
        }

        List<String> words = new ArrayList<>();

        for (String s : text.split(" ")) {
            if (s.length() > 0)
                words.add(s);
        }

        StringBuilder sb = new StringBuilder();
        int space = words.size() == 1 ? 0 : spaces / (words.size() - 1);
        int end = words.size() == 1 ? spaces : spaces % (words.size() - 1);

        for (int index = 0; index < words.size(); index++) {
            String word = words.get(index);
            sb.append(word);

            if (index + 1 != words.size()) {
                for (int i = 0; i < space; i++) {
                    sb.append(" ");
                }
            }
        }

        for (int i = 0; i < end; i++) {
            sb.append(" ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        assert reorderSpaces("  this   is  a sentence ").equals("this   is   a   sentence");
    }
}
