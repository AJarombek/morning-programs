// Rust application entrypoint for testing the programs.
// Author: Andrew Jarombek
// Date: 1/22/2022

use crate::maximum_subarray::max_sub_array;
use crate::search_insert_position::search_insert;

mod search_insert_position;
mod maximum_subarray;

fn main() {
    assert_eq!(search_insert(vec![1,3,4,6], 2), 1);
    assert_eq!(max_sub_array(vec![5,4,-1,7,8]), 23);
}
