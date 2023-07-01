/**
 * https://leetcode.com/problems/island-perimeter/
 * Author: Andrew Jarombek
 * Date: 7/1/2023
 */

package _go

import (
	"math"
	"strings"
)

func licenseKeyFormatting(s string, k int) string {
	s = strings.Replace(s, "-", "", -1)
	result := ""
	index := len(s)

	for index > 0 {
		start := max(0, index-k)
		result = s[start:index] + "-" + result
		index -= k
	}

	if len(result) == 0 {
		return ""
	}

	return strings.ToUpper(result[:len(result)-1])
}

func max(a, b int) int {
	return int(math.Max(float64(a), float64(b)))
}
