// Program: https://leetcode.com/problems/palindrome-number/
// Author: Andrew Jarombek
// Date: 9/22/2021

pub fn is_palindrome(x: i32) -> bool {
    if x < 0 {
        return false;
    }

    if x < 10 {
        return true;
    }

    let mut z: i32 = x;
    let mut y: i64 = 0 as i64;

    while z > 0 {
        y *= 10;
        y += (z % 10) as i64;
        z /= 10;
    }

    return x as i64 == y;
}

fn main() {
    assert!(is_palindrome(121));
    assert!(!is_palindrome(-121));
}
