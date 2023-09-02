/**
 * https://leetcode.com/problems/unique-morse-code-words/
 * Author: Andrew Jarombek
 * Date: 9/2/2023
 */

package _go

import "strings"

func uniqueMorseRepresentations(words []string) int {
	morseCodes := map[string]string{
		"a": ".-",
		"b": "-...",
		"c": "-.-.",
		"d": "-..",
		"e": ".",
		"f": "..-.",
		"g": "--.",
		"h": "....",
		"i": "..",
		"j": ".---",
		"k": "-.-",
		"l": ".-..",
		"m": "--",
		"n": "-.",
		"o": "---",
		"p": ".--.",
		"q": "--.-",
		"r": ".-.",
		"s": "...",
		"t": "-",
		"u": "..-",
		"v": "...-",
		"w": ".--",
		"x": "-..-",
		"y": "-.--",
		"z": "--..",
	}

	codes := make(map[string]bool)

	for _, word := range words {
		var morseCode strings.Builder

		for _, char := range word {
			morseCode.WriteString(morseCodes[string(char)])
		}

		codes[morseCode.String()] = true
	}

	return len(codes)
}
