/*
 * Unit tests for maximum-units-on-a-truck program
 * @author Andrew Jarombek
 * @since 11/1/2022
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaximumUnitsOnTruckTest {
    @Test
    public void reformatPhoneNumber() {
        assertEquals(
            8, MaximumUnitsOnTruck.maximumUnits(new int[][]{new int[]{1, 3}, new int[]{2, 2}, new int[]{3, 1}}, 4)
        );
        assertEquals(
            91, MaximumUnitsOnTruck.maximumUnits(new int[][]{new int[]{5, 10}, new int[]{2, 5}, new int[]{4, 7}, new int[]{3, 9}}, 10)
        );
    }
}
