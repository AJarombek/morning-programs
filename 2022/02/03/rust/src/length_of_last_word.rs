// Program: https://leetcode.com/problems/length-of-last-word/
// Author: Andrew Jarombek
// Date: 2/3/2022

pub fn length_of_last_word(s: String) -> i32 {
    let mut count = 0;
    let mut space = false;

    for c in s.chars() {
        if c == ' ' {
            space = true;
        } else if space {
            space = false;
            count = 1;
        } else {
            count += 1;
        }
    }

    return count;
}