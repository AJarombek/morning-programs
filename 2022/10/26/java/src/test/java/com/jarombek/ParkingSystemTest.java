/*
 * Unit tests for design-parking-system program
 * @author Andrew Jarombek
 * @since 10/26/2022
 */

package com.jarombek;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ParkingSystemTest {
    @Test
    public void parkingSystem() {
        var parking = new ParkingSystem(1, 1, 0);
        assertTrue(parking.addCar(1));
        assertTrue(parking.addCar(2));
        assertFalse(parking.addCar(3));
        assertFalse(parking.addCar(1));
    }
}
