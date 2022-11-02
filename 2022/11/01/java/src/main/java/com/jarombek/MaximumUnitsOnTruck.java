/*
 * https://leetcode.com/problems/maximum-units-on-a-truck/
 * @author Andrew Jarombek
 * @since 11/1/2022
 */

package com.jarombek;

import java.util.Arrays;
import java.util.Comparator;

class MaximumUnitsOnTruck {
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, Comparator.comparingInt(a -> -a[1]));

        int result = 0;
        int remaining = truckSize;
        int index = 0;

        while (index < boxTypes.length && remaining > 0) {
            int[] box = boxTypes[index];
            int count = Math.min(box[0], remaining);

            result += count * box[1];
            remaining -= count;
            index++;
        }

        return result;
    }
}
