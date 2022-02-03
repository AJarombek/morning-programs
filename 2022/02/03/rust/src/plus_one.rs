// Program: https://leetcode.com/problems/plus-one/
// Author: Andrew Jarombek
// Date: 2/3/2022

pub fn plus_one(digits: Vec<i32>) -> Vec<i32> {
    let mut vec = digits.to_vec();
    let mut remainder = 1;

    for i in (0..vec.len()).rev() {
        let val = vec[i] + remainder;
        vec[i] = val % 10;
        remainder = val / 10;
    }

    if remainder == 1 {
        let mut longer_vec = Vec::new();
        longer_vec.push(1);
        longer_vec.extend(vec.iter().copied());
        return longer_vec;
    }

    return vec;
}