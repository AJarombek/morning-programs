/**
 * https://leetcode.com/problems/valid-anagram/
 * Author: Andrew Jarombek
 * Date: 11/11/2022
 */

package _go

func isAnagram(s string, t string) bool {
	sChars := map[string]int{}
	tChars := map[string]int{}

	for _, code := range s {
		c := string(code)
		if val, ok := sChars[c]; ok {
			sChars[c] = val + 1
		} else {
			sChars[c] = 1
		}
	}

	for _, code := range t {
		c := string(code)
		if val, ok := tChars[c]; ok {
			tChars[c] = val + 1
		} else {
			tChars[c] = 1
		}
	}

	if len(sChars) != len(tChars) {
		return false
	}

	for key, value := range sChars {
		if value != tChars[key] {
			return false
		}
	}

	return true
}
