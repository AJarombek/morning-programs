/**
 * https://leetcode.com/problems/convert-a-number-to-hexadecimal/
 * Author: Andrew Jarombek
 * Date: 6/17/2023
 */

package _go

import "math"

func toHex(num int) string {
	if num == 0 {
		return "0"
	}

	if num < 0 {
		num = int(math.Pow(2, 32)) + num
	}

	result := ""

	for num > 0 {
		val := num % 16

		if val < 10 {
			result = string(rune(val+48)) + result
		} else {
			result = string(rune(val+87)) + result
		}

		num = num / 16
	}

	return result
}
