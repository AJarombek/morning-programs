/**
 * https://leetcode.com/problems/base-7/
 * Author: Andrew Jarombek
 * Date: 7/8/2023
 */

package _go

func convertToBase7(num int) string {
	if num == 0 {
		return "0"
	}

	negative := false
	if num < 0 {
		negative = true
		num = -num
	}

	result := ""
	for num > 0 {
		result = string(rune(num%7+'0')) + result
		num /= 7
	}

	if negative {
		result = "-" + result
	}

	return result
}
