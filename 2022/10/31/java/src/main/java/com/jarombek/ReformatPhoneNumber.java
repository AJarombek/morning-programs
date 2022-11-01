/*
 * https://leetcode.com/problems/reformat-phone-number/
 * @author Andrew Jarombek
 * @since 10/31/2022
 */

package com.jarombek;

class ReformatPhoneNumber {
    public static String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder();

        for (char c : number.toCharArray()) {
            if (c != '-' && c != ' ') {
                sb.append(c);
            }
        }

        String s = sb.toString();
        sb = new StringBuilder();
        int i = 0;

        while (i < s.length() - 4) {
            sb.append("-");
            sb.append(s, i, i+3);
            i += 3;
        }

        if (s.length() - i == 4) {
            sb.append("-");
            sb.append(s, i, i+2);
            i += 2;
        }

        sb.append("-");
        sb.append(s.substring(i));
        return sb.toString().substring(1);
    }
}
