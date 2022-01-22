// Program: https://leetcode.com/problems/search-insert-position/
// Author: Andrew Jarombek
// Date: 1/22/2022

pub fn search_insert(nums: Vec<i32>, target: i32) -> i32 {
    let mut i = 0;

    while i < nums.len() {
        if nums[i] >= target {
            return i as i32;
        }

        i += 1;
    }

    return i as i32;
}