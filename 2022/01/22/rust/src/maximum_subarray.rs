// Program: https://leetcode.com/problems/maximum-subarray/
// Author: Andrew Jarombek
// Date: 1/22/2022

pub fn max_sub_array(nums: Vec<i32>) -> i32 {
    let mut max = i32::MIN;
    let mut current = 0;

    for num in nums {
        max = std::cmp::max(current + num, max);
        current = std::cmp::max(0, current + num);
    }

    return max;
}