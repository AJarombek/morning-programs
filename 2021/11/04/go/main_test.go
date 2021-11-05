/**
 * https://leetcode.com/problems/roman-to-integer/.
 * Author: Andrew Jarombek
 * Date: 11/4/2021
 */

package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func romanToInt(s string) int {
	numerals := make(map[string]int)
	numerals["I"] = 1
	numerals["IV"] = 4
	numerals["V"] = 5
	numerals["IX"] = 9
	numerals["X"] = 10
	numerals["XL"] = 40
	numerals["L"] = 50
	numerals["XC"] = 90
	numerals["C"] = 100
	numerals["CD"] = 400
	numerals["D"] = 500
	numerals["CM"] = 900
	numerals["M"] = 1000

	result := 0
	index := 0
	for index < len(s) {

		firstValue := numerals[string(s[index])]
		secondValue := 0

		if index + 1 < len(s) {
			secondValue = numerals[string(s[index + 1])]
		}

		if firstValue < secondValue {
			result += numerals[string(s[index]) + string(s[index + 1])]
			index += 2
		} else {
			result += firstValue
			index += 1
		}
	}

	return result
}

func TestRomanToInt(t *testing.T) {
	assert.Equal(t, 1994, romanToInt("MCMXCIV"))
}