/**
 * https://leetcode.com/problems/shortest-completing-word/
 * Author: Andrew Jarombek
 * Date: 8/18/2023
 */

package _go

func shortestCompletingWord(licensePlate string, words []string) string {
	letters := make(map[rune]int)

	for _, char := range licensePlate {
		if char >= 'a' && char <= 'z' {
			letters[char]++
		} else if char >= 'A' && char <= 'Z' {
			letters[char+32]++
		}
	}

	result := ""

	for _, word := range words {
		wordLetters := make(map[rune]int)

		for _, char := range word {
			if char >= 'a' && char <= 'z' {
				wordLetters[char]++
			} else if char >= 'A' && char <= 'Z' {
				wordLetters[char+32]++
			}
		}

		valid := true

		for key, value := range letters {
			if wordLetters[key] < value {
				valid = false
				break
			}
		}

		if valid && (len(result) == 0 || len(result) > len(word)) {
			result = word
		}
	}

	return result
}
