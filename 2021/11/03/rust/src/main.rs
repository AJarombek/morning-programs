// Program: https://leetcode.com/problems/valid-parentheses/
// Author: Andrew Jarombek
// Date: 11/3/2021

use std::collections::VecDeque;

pub fn is_valid(s: String) -> bool {
    let mut stack: VecDeque<char> = VecDeque::new();

    for c in s.chars() {
        if c == '[' {
            stack.push_back(']');
        } else if c == '{' {
            stack.push_back('}');
        } else if c == '(' {
            stack.push_back(')');
        } else {
            let expected_c: Option<char> = stack.pop_back();

            if expected_c.is_none() || c != expected_c.unwrap() {
                return false;
            }
        }
    }

    return stack.len() == 0;
}

fn main() {
    assert!(is_valid(String::from("()")));
    assert!(is_valid(String::from("[]{}()")));
    assert!(is_valid(String::from("{()}")));
    assert!(!is_valid(String::from("([)]")));
}
