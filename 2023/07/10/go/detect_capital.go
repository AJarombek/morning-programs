/**
 * https://leetcode.com/problems/detect-capital/
 * Author: Andrew Jarombek
 * Date: 7/10/2023
 */

package _go

import (
	"unicode"
)

func detectCapitalUse(word string) bool {
	if len(word) < 2 {
		return true
	}

	first := rune(word[0])
	second := rune(word[1])

	if unicode.IsUpper(first) && unicode.IsUpper(second) {
		for i := 2; i < len(word); i++ {
			if !unicode.IsUpper(rune(word[i])) {
				return false
			}
		}
	} else {
		for i := 1; i < len(word); i++ {
			if unicode.IsUpper(rune(word[i])) {
				return false
			}
		}
	}

	return true
}
