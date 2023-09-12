/*
 * Unit tests for a goat-latin program
 * @author Andrew Jarombek
 * @since 9/11/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void toGoatLatin() {
        var solution = new Solution();

        assertEquals(
            "Imaa peaksmaaa oatGmaaaa atinLmaaaaa",
            solution.toGoatLatin("I speak Goat Latin")
        );
        assertEquals(
            "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa",
            solution.toGoatLatin("The quick brown fox jumped over the lazy dog")
        );
    }
}
