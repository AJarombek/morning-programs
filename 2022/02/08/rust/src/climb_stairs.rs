// https://leetcode.com/problems/climbing-stairs/
// Author: Andrew Jarombek
// Date: 2/8/2022

pub fn climb_stairs(n: i32) -> i32 {
    if n < 4 {
        return n;
    }

    let mut prev = 2;
    let mut current = 3;

    for _ in 4..n+1 {
        let temp = current;
        current = prev + current;
        prev = temp;
    }

    return current;
}