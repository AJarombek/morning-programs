/**
 * https://leetcode.com/problems/keyboard-row/
 * Author: Andrew Jarombek
 * Date: 7/6/2023
 */

package _go

import "strings"

func findWords(words []string) []string {
	rows := make(map[byte]int)

	for _, c := range "qwertyuiop" {
		rows[byte(c)] = 1
	}

	for _, c := range "asdfghjkl" {
		rows[byte(c)] = 2
	}

	for _, c := range "zxcvbnm" {
		rows[byte(c)] = 3
	}

	var result []string

	for _, word := range words {
		lower := strings.ToLower(word)
		row := rows[lower[0]]
		i := 1
		valid := true

		for valid && i < len(lower) {
			if row != rows[lower[i]] {
				valid = false
			} else {
				i++
			}
		}

		if valid {
			result = append(result, word)
		}
	}

	return result
}
