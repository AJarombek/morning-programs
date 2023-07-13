/**
 * https://leetcode.com/problems/reverse-string-ii/
 * Author: Andrew Jarombek
 * Date: 7/12/2023
 */

package _go

import (
	"math"
	"strings"
)

func reverseStr(s string, k int) string {
	builder := strings.Builder{}
	i := 0

	for i < len(s) {
		for j := int(math.Min(float64(i+k), float64(len(s)))) - 1; j >= i; j-- {
			builder.WriteByte(s[j])
		}

		for j := i + k; j < int(math.Min(float64(i+k*2), float64(len(s)))); j++ {
			builder.WriteByte(s[j])
		}

		i += k * 2
	}

	return builder.String()
}
