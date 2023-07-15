/**
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
 * Author: Andrew Jarombek
 * Date: 7/15/2023
 */

package _go

import "strings"

func reverseWords(s string) string {
	words := strings.Split(s, " ")
	var result []string

	for _, word := range words {
		builder := strings.Builder{}

		for j := len(word) - 1; j >= 0; j-- {
			builder.WriteByte(word[j])
		}

		result = append(result, builder.String())
	}

	return strings.Join(result, " ")
}
