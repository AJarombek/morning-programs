/*
 * Unit tests for goal-parser-interpretation program
 * @author Andrew Jarombek
 * @since 10/30/2022
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GoalParserTest {
    @Test
    public void goalParser() {
        assertEquals("Goal", GoalParser.interpret("G()(al)"));
        assertEquals("Gooooal", GoalParser.interpret("G()()()()(al)"));
    }
}
