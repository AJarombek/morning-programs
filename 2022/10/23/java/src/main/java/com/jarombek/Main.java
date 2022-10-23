/*
 * Application main method for count-good-triplets program
 * @author Andrew Jarombek
 * @since 10/23/2022
 */

package com.jarombek;

public class Main {
    public static void main(String[] args) {
        int result = GoodTriplets.countGoodTriplets(new int[] {3, 0, 1, 1, 9, 7}, 7, 2, 3);
        System.out.println("countGoodTriplets([3, 0, 1, 1, 9, 7], 7, 2, 3) == " + result);
    }
}
