/**
 * https://leetcode.com/problems/rotate-string/
 * Author: Andrew Jarombek
 * Date: 8/27/2023
 */

package _go

import "strings"

func rotateString(s string, goal string) bool {
	if len(s) != len(goal) {
		return false
	}

	target := goal + goal

	return strings.Contains(target, s)
}
