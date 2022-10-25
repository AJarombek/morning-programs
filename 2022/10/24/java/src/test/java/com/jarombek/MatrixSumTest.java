/*
 * Unit tests for matrix-diagonal-sum program
 * @author Andrew Jarombek
 * @since 10/24/2022
 */

package com.jarombek;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MatrixSumTest {
    @Test
    public void matrixSum() {
        int result = MatrixSum.diagonalSum(new int[][] {
            new int[] {1, 2, 3},
            new int[] {4, 5, 6},
            new int[] {7, 8, 9}
        });
        assertEquals(25, result);
    }
}
