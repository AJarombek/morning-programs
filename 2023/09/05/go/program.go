/**
 * https://leetcode.com/problems/most-common-word/
 * Author: Andrew Jarombek
 * Date: 9/5/2023
 */

package _go

import "strings"

func mostCommonWord(paragraph string, banned []string) string {
	bannedSet := make(map[string]bool)

	for _, word := range banned {
		bannedSet[word] = true
	}

	words := make(map[string]int)
	result := ""

	for _, word := range strings.Split(paragraph, " ") {
		word = strings.ToLower(word)
		word = strings.Trim(word, "!?',;.")

		if !bannedSet[word] {
			value := words[word] + 1

			if value > words[result] {
				result = word
			}

			words[word]++
		}
	}

	return result
}
