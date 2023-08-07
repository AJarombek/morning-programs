/**
 * https://leetcode.com/problems/valid-palindrome-ii/
 * Author: Andrew Jarombek
 * Date: 8/6/2023
 */

package _go

func validPalindrome(s string) bool {
	if isPalindrome(s) {
		return true
	}

	start := 0
	end := len(s) - 1

	for start < end {
		if s[start] != s[end] {
			return isPalindrome(s[:start]+s[start+1:]) || isPalindrome(s[:end]+s[end+1:])
		}

		start++
		end--
	}

	return false
}

func isPalindrome(s string) bool {
	start := 0
	end := len(s) - 1

	for start < end {
		if s[start] != s[end] {
			return false
		}

		start++
		end--
	}

	return true
}
