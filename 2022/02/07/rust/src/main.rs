// https://leetcode.com/problems/add-binary/
// Author: Andrew Jarombek
// Date: 2/7/2022

use std::cmp::max;

pub fn add_binary(a: String, b: String) -> String {
    let mut i: usize = a.len();
    let mut j: usize = b.len();
    let mut value: i32 = 0;
    let mut result: Vec<&str> = vec!["0"; max(i, j)];
    let mut index: usize = result.len() - 1;

    let a_vec: Vec<char> = a.chars().collect();
    let b_vec: Vec<char> = b.chars().collect();

    while i > 0 || j > 0 {
        let x: char = if i > 0 {a_vec[i - 1]} else {'0'};
        let y: char = if j > 0 {b_vec[j - 1]} else {'0'};

        if x == '1' {
            value += 1;
        }

        if y == '1' {
            value += 1;
        }

        if value == 3 || value == 1 {
            result[index] = "1";
        } else {
            result[index] = "0";
        }

        if index > 0 {
            index -= 1;
        }

        if i > 0 {
            i -= 1;
        }

        if j > 0 {
            j -= 1;
        }

        value = if value >= 2 {1} else {0};
    }

    if value > 0 {
        return "1".to_owned() + &*result.join("");
    }

    return result.join("");
}

fn main() {
    assert_eq!(add_binary(String::from("1100"), String::from("101")), "10001");
}
