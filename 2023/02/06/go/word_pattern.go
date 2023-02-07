/**
 * https://leetcode.com/problems/word-pattern/
 * Author: Andrew Jarombek
 * Date: 2/6/2023
 */

package _go

import "strings"

func wordPattern(pattern string, s string) bool {
	chars := []byte(pattern)
	words := strings.Fields(s)

	if len(chars) != len(words) {
		return false
	}

	matches := make(map[byte]string)
	existing := make(map[string]struct{})

	for i, c := range chars {
		if match, ok := matches[c]; ok {
			if match != words[i] {
				return false
			}
		} else {
			word := words[i]

			if _, ok := existing[word]; ok {
				return false
			}

			matches[c] = words[i]
			existing[word] = struct{}{}
		}
	}

	return true
}
