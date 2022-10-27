/*
 * https://leetcode.com/problems/design-parking-system/
 * @author Andrew Jarombek
 * @since 10/26/2022
 */

package com.jarombek;

class ParkingSystem {
    private int[] spots;

    public ParkingSystem(int big, int medium, int small) {
        this.spots = new int[] {big, medium, small};
    }

    public boolean addCar(int carType) {
        int val = this.spots[carType - 1];
        this.spots[carType - 1] -= 1;
        return val > 0;
    }
}
