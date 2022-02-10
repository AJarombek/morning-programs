/**
 * https://leetcode.com/problems/implement-strstr/
 * Author: Andrew Jarombek
 * Date: 2/9/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func strStr(haystack string, needle string) int {
	if len(needle) > len(haystack) {
		return -1
	}

	if len(needle) == 0 {
		return 0
	}

	index := 0

	for index <= len(haystack) - len(needle) {
		if needle == haystack[index:index + len(needle)] {
			return index
		}

		index += 1
	}

	return -1
}

func TestStrStr(t *testing.T) {
	assert.Equal(t, 2, strStr("hello", "ll"))
	assert.Equal(t, -1, strStr("aaaaa", "bba"))
	assert.Equal(t, 0, strStr("", ""))
}