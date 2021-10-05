// Program: https://leetcode.com/problems/roman-to-integer/
// Author: Andrew Jarombek
// Date: 10/4/2021

use std::collections::HashMap;

pub fn roman_to_int(s: String) -> i32 {
    let mut numerals: HashMap<&str, i16> = HashMap::new();
    numerals.insert("I", 1);
    numerals.insert("IV", 4);
    numerals.insert("V", 5);
    numerals.insert("IX", 9);
    numerals.insert("X", 10);
    numerals.insert("XL", 40);
    numerals.insert("L", 50);
    numerals.insert("XC", 90);
    numerals.insert("C", 100);
    numerals.insert("CD", 400);
    numerals.insert("D", 500);
    numerals.insert("CM", 900);
    numerals.insert("M", 1000);

    let mut result: i16 = 0;
    let mut index: usize = 0;
    let b: &[u8] = s.as_bytes();

    while index < s.len() {
        let first_char = b[index] as char;
        if index + 1 < s.len() {
            let second_char = b[index + 1] as char;
            let mut numeral: String = first_char.to_string();
            numeral.push(second_char);

            let match_num: Option<&i16> = numerals.get(&*numeral);

            if !match_num.is_none() {
                result += match_num.unwrap();
                index += 2;
                continue;
            }
        }

        let mut tmp = [0u8; 4];
        let match_num: Option<&i16> = numerals.get(first_char.encode_utf8(&mut tmp));

        result += match_num.unwrap();
        index += 1;
    }

    return result as i32;
}

fn main() {
    assert_eq!(roman_to_int(String::from("IV")), 4);
    assert_eq!(roman_to_int(String::from("LVIII")), 58);
}
