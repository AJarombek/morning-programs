/*
 * https://leetcode.com/problems/count-good-triplets/
 * @author Andrew Jarombek
 * @since 10/23/2022
 */

package com.jarombek;

public class GoodTriplets {
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int result = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                boolean x = Math.abs(arr[i] - arr[j]) <= a;

                if (x) {
                    for (int k = j + 1; k < arr.length; k++) {
                        boolean y = Math.abs(arr[j] - arr[k]) <= b;
                        boolean z = Math.abs(arr[i] - arr[k]) <= c;

                        if (y && z)
                            result += 1;
                    }
                }
            }
        }

        return result;
    }
}
