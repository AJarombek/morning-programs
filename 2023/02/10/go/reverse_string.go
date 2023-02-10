/**
 * https://leetcode.com/problems/reverse-string/
 * Author: Andrew Jarombek
 * Date: 2/10/2023
 */

package _go

// I can live like that with you.  Please trust love to overcome all and forgive all.
// I don't want to be locked away in your mind.

func reverseString(s []byte) {
	i := 0
	j := len(s) - 1

	for i < j {
		s[i], s[j] = s[j], s[i]

		i++
		j--
	}
}
