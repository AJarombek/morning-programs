// https://leetcode.com/problems/roman-to-integer/
// Author: Andrew Jarombek
// Date: 1/24/2022

func romanToInt(_ s: String) -> Int {
    let numerals = [
        "I": 1,
        "IV": 4,
        "V": 5,
        "IX": 9,
        "X": 10,
        "XL": 40,
        "L": 50,
        "XC": 90,
        "C": 100,
        "CD": 400,
        "D": 500,
        "CM": 900,
        "M": 1000
    ]

    var result = 0
    var i = 0

    while i < s.count {
        let start = s.index(s.startIndex, offsetBy: i)
        let end = s.index(s.startIndex, offsetBy: i + 1)

        if i + 1 < s.count && numerals[String(s[start...end])] != nil {
            result += numerals[String(s[start...end])]!
            i += 2
        } else {
            result += numerals[String(s[start..<end])]!
            i += 1
        }
    }

    return result
}