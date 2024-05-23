/*
 * https://leetcode.com/problems/unique-email-addresses/
 * @author Andrew Jarombek
 * @since 5/22/2024
 */

package com.jarombek;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            boolean ignore = false;

            while (i < email.length()) {
                char c = email.charAt(i);

                if (c == '@') {
                    sb.append(c);
                    i++;
                    break;
                }

                if (c == '+' && !ignore) {
                    ignore = true;
                } else if (c != '.' && !ignore) {
                    sb.append(c);
                }

                i++;
            }

            sb.append(email.substring(i));
            uniqueEmails.add(sb.toString());
        }

        return uniqueEmails.size();
    }
}
