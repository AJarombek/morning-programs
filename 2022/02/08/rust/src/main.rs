// Main method to test programs
// Author: Andrew Jarombek
// Date: 2/8/2022

use crate::climb_stairs::climb_stairs;

mod climb_stairs;
mod remove_duplicates;

fn main() {
    assert_eq!(climb_stairs(1), 1);
    assert_eq!(climb_stairs(2), 2);
    assert_eq!(climb_stairs(3), 3);
    assert_eq!(climb_stairs(4), 5);
    assert_eq!(climb_stairs(5), 8);
}
