/**
 * https://leetcode.com/problems/1-bit-and-2-bit-characters/
 * Author: Andrew Jarombek
 * Date: 8/11/2023
 */

package _go

func isOneBitCharacter(bits []int) bool {
	if len(bits) == 1 {
		return true
	}

	if bits[len(bits)-1] == 1 {
		return false
	}

	if bits[len(bits)-2] == 0 {
		return true
	}

	count := 0
	index := len(bits) - 2

	for index >= 0 && bits[index] == 1 {
		index--
		count++
	}

	return count%2 == 0
}
