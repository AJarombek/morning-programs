"""
https://leetcode.com/problems/design-parking-system/
Author: Andrew Jarombek
Date: 8/20/2022
"""


class ParkingSystem:

    def __init__(self, big: int, medium: int, small: int):
        self.lot = [big, medium, small]

    def add_car(self, car_type: int) -> bool:
        if self.lot[car_type - 1] > 0:
            self.lot[car_type - 1] -= 1
            return True

        return False


if __name__ == '__main__':
    parking = ParkingSystem(big=1, medium=1, small=0)
    assert parking.add_car(1)
    assert parking.add_car(2)
    assert not parking.add_car(3)
    assert not parking.add_car(1)

