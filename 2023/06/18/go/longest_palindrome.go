/**
 * https://leetcode.com/problems/longest-palindrome/
 * Author: Andrew Jarombek
 * Date: 6/18/2023
 */

package _go

func longestPalindrome(s string) int {
	var chars = make(map[rune]int)

	for _, c := range s {
		chars[c]++
	}

	result := 0
	odd := false

	for _, value := range chars {
		if value%2 == 1 {
			odd = true
			result += value - 1
		} else {
			result += value
		}
	}

	if odd {
		result++
	}

	return result
}
