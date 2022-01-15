// Program: https://leetcode.com/problems/remove-element/
// Author: Andrew Jarombek
// Date: 1/15/2022

use crate::str_str::str_str;

mod str_str;

pub fn remove_element(nums: &mut Vec<i32>, val: i32) -> i32 {
    let mut index: usize = 0;
    let mut end: usize = nums.len();

    while index < end {
        if nums[index] == val {
            nums[index] = nums[end - 1];
            end -= 1;
        } else {
            index += 1;
        }
    }

    return index as i32;
}

fn main() {
    let mut vector: Vec<i32> = vec![1, 2, 3];
    assert_eq!(remove_element(&mut vector, 2), 2);

    assert_eq!(str_str(String::from("aab"), String::from("ab")), 1);
}
