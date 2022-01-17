// https://leetcode.com/problems/palindrome-number/
// Author: Andrew Jarombek
// Date: 1/17/2022

func isPalindrome(_ x: Int) -> Bool {
    if x < 0 {
        return false
    }

    if x < 10 {
        return true
    }

    var y = x
    var z = 0

    while y > 0 {
        z *= 10
        z += y % 10
        y /= 10
    }

    return z == x
}