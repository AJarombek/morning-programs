/**
 * https://leetcode.com/problems/ransom-note/
 * Author: Andrew Jarombek
 * Date: 6/12/2023
 */

package _go

func canConstruct(ransomNote string, magazine string) bool {
	var chars = make(map[rune]int)

	for _, char := range magazine {
		chars[char]++
	}

	for _, char := range ransomNote {
		chars[char]--

		if chars[char] < 0 {
			return false
		}
	}

	return true
}
