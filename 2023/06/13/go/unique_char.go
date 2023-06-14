/**
 * https://leetcode.com/problems/ransom-note/
 * Author: Andrew Jarombek
 * Date: 6/13/2023
 */

package _go

func firstUniqChar(s string) int {
	var chars = make(map[rune]int)

	for _, char := range s {
		chars[char]++
	}

	for index, char := range s {
		if chars[char] == 1 {
			return index
		}
	}

	return -1
}
