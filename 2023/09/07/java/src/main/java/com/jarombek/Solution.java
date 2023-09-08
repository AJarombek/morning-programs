/*
 * https://leetcode.com/problems/unique-morse-code-words/
 * @author Andrew Jarombek
 * @since 9/7/2023
 */

package com.jarombek;

import java.util.*;

public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Map<Character, String> morse = new HashMap<>();
        morse.put('a', ".-");
        morse.put('b', "-...");
        morse.put('c', "-.-.");
        morse.put('d', "-..");
        morse.put('e', ".");
        morse.put('f', "..-.");
        morse.put('g', "--.");
        morse.put('h', "....");
        morse.put('i', "..");
        morse.put('j', ".---");
        morse.put('k', "-.-");
        morse.put('l', ".-..");
        morse.put('m', "--");
        morse.put('n', "-.");
        morse.put('o', "---");
        morse.put('p', ".--.");
        morse.put('q', "--.-");
        morse.put('r', ".-.");
        morse.put('s', "...");
        morse.put('t', "-");
        morse.put('u', "..-");
        morse.put('v', "...-");
        morse.put('w', ".--");
        morse.put('x', "-..-");
        morse.put('y', "-.--");
        morse.put('z', "--..");

        Set<String> uniqueCodes = new HashSet<>();

        for (String word : words) {
            var sb = new StringBuilder();

            for (char c : word.toCharArray()) {
                sb.append(morse.get(c));
            }

            uniqueCodes.add(sb.toString());
        }

        return uniqueCodes.size();
    }
}
