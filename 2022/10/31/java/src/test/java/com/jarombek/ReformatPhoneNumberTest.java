/*
 * Unit tests for reformat-phone-number program
 * @author Andrew Jarombek
 * @since 10/31/2022
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReformatPhoneNumberTest {
    @Test
    public void reformatPhoneNumber() {
        assertEquals("123-456", ReformatPhoneNumber.reformatNumber("1-23-45 6"));
        assertEquals("123-45-67", ReformatPhoneNumber.reformatNumber("123 4-567"));
        assertEquals("123-456-78", ReformatPhoneNumber.reformatNumber("123 4-5678"));
    }
}
