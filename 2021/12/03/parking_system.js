/**
 * https://leetcode.com/problems/design-parking-system/
 * @author Andrew Jarombek
 * @since 12/3/2021
 */

const ParkingSystem = function(big, medium, small) {
    this.capacity = [big, medium, small];
    this.usage = [0, 0, 0];
};

ParkingSystem.prototype.addCar = function(carType) {
    if (this.usage[carType - 1] < this.capacity[carType - 1]) {
        this.usage[carType - 1] = this.usage[carType - 1] + 1;
        return true;
    } else {
        return false;
    }
};