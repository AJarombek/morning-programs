/*
 * Unit tests for the morning program
 * @author Andrew Jarombek
 * @since 5/22/2024
 */

package com.jarombek;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testNumUniqueEmails() {
        Solution solution = new Solution();
        int result = solution.numUniqueEmails(new String[]{
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"
        });
        assertEquals(2, result);
    }

    @Test
    public void testNumUniqueEmails2() {
        Solution solution = new Solution();
        int result = solution.numUniqueEmails(new String[]{
                "a@leetcode.com","b@leetcode.com","c@leetcode.com"
        });
        assertEquals(3, result);
    }
}
