/**
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 * Author: Andrew Jarombek
 * Date: 8/15/2023
 */

package _go

func nextGreatestLetter(letters []byte, target byte) byte {
	for _, letter := range letters {
		if letter > target {
			return letter
		}
	}

	return letters[0]
}
