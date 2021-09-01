// Program: https://leetcode.com/problems/two-sum/
// Author: Andrew Jarombek
// Date: 9/1/2021

pub fn reverse(x: i32) -> i32 {
    if x == 0 {
        return x;
    }

    let mut val: i64 = x as i64;
    let mut is_negative = false;

    if val < 0 {
        val = val.abs();
        is_negative = true;
    }

    while val % 10 == 0 {
        val /= 10;
    }

    let mut result = 0;
    while val > 0 {
        result *= 10;
        result += val % 10;
        val /= 10;
    }

    if is_negative {
        result = 0 - result;
    }

    if result > i32::MAX as i64 || result < i32::MIN as i64 {
        return 0;
    }

    return result as i32;
}

fn main() {
    assert_eq!(reverse(123), 321);
}
