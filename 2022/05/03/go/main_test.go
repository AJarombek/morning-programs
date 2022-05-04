/**
 * https://leetcode.com/problems/add-binary/
 * Author: Andrew Jarombek
 * Date: 5/3/2022
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"strings"
	"testing"
)

func addBinary(a string, b string) string {
	var sb strings.Builder
	aBytes := []byte(a)
	bBytes := []byte(b)
	i := len(aBytes) - 1
	j := len(bBytes) - 1
	remainder := 0

	for i >= 0 || j >= 0 || remainder > 0 {
		val := remainder

		if i >= 0 && aBytes[i] == '1' {
			val++
		}

		if j >= 0 && bBytes[j] == '1' {
			val++
		}

		sb.WriteByte(byte(val % 2))

		if val >= 2 {
			remainder = 1
		} else {
			remainder = 0
		}

		i--
		j--
	}

	s := []byte(sb.String())
	var result strings.Builder

	for i := len(s) - 1; i >= 0; i-- {
		result.WriteByte(s[i])
	}

	return result.String()
}

func TestPlusOne(t *testing.T) {
	result := addBinary("1", "11")
	assert.Equal(t, "100", result)
}