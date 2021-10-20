// Program: https://leetcode.com/problems/longest-common-prefix/
// Author: Andrew Jarombek
// Date: 10/19/2021

use std::cmp;
use std::str::Chars;

pub fn longest_common_prefix(strs: Vec<String>) -> String {
    let mut prefix: &str = strs.iter().nth(0).unwrap().as_str();

    for str in strs.iter() {
        println!("{}", str);
        if str != prefix {
            println!("{} != {}", str, prefix);
            let mut str_chars: Chars = str.chars();
            let mut prefix_chars: Chars = prefix.chars();
            let mut i = 0;
            let max = cmp::min(str.len(), prefix.len());

            while i < max && str_chars.nth(0) == prefix_chars.nth(0) {
                i += 1;
            }

            if i == 0 {
                return String::from("");
            } else {
                prefix = &str[..i];
            }
        }
    }

    return String::from(prefix);
}

fn main() {
    assert_eq!(
        longest_common_prefix(
            vec![String::from("flower"),String::from("flow"),String::from("flight")]
        ),
        "fl"
    );

    assert_eq!(longest_common_prefix(vec![String::from("ab"),String::from("a")]), "a");
}
