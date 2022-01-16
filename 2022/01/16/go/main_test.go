/**
 * https://leetcode.com/problems/longest-common-prefix/
 * Author: Andrew Jarombek
 * Date: 1/16/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func longestCommonPrefix(strs []string) string {
	prefix := strs[0]
	for i := 1; i < len(strs); i++ {
		str := strs[i]
		index := 0
		end := 0

		if len(prefix) > len(str) {
			end = len(str)
		} else {
			end = len(prefix)
		}

		for index < end {
			if str[index] != prefix[index] {
				break
			}

			index += 1
		}

		prefix = prefix[:index]

		if len(prefix) == 0 {
			return prefix
		}
	}

	return prefix
}

func TestRomanToInt(t *testing.T) {
	assert.Equal(t, "and", longestCommonPrefix([]string {"andy", "andrew"}))
}