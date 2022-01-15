// Program: https://leetcode.com/problems/implement-strstr/
// Author: Andrew Jarombek
// Date: 1/15/2022

pub fn str_str(haystack: String, needle: String) -> i32 {
    if needle.len() == 0 {
        return 0;
    }

    if haystack.len() == 0 {
        return -1;
    }

    if haystack.len() < needle.len() {
        return -1;
    }

    let mut index: usize = 0;

    while index < haystack.len() - needle.len() + 1 {
        if haystack[index..index+needle.len()] == needle {
            return index as i32;
        }

        index += 1
    }

    return -1;
}