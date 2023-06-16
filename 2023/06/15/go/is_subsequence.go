/**
 * https://leetcode.com/problems/is-subsequence/
 * Author: Andrew Jarombek
 * Date: 6/15/2023
 */

package _go

func isSubsequence(s string, t string) bool {
	i := 0
	j := 0

	for i < len(s) && j < len(t) {
		if s[i] == t[j] {
			i++
		}

		j++
	}

	return i == len(s)
}
