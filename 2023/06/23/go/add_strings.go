/**
 * https://leetcode.com/problems/add-strings/
 * Author: Andrew Jarombek
 * Date: 6/23/2023
 */

package _go

func addStrings(num1 string, num2 string) string {
	result := ""
	carry := 0

	for i, j := len(num1)-1, len(num2)-1; i >= 0 || j >= 0 || carry > 0; i, j = i-1, j-1 {
		var digit1, digit2 int

		if i >= 0 {
			digit1 = int(num1[i] - '0')
		}

		if j >= 0 {
			digit2 = int(num2[j] - '0')
		}

		sum := digit1 + digit2 + carry
		result = string(rune(sum%10+'0')) + result
		carry = sum / 10
	}

	return result
}
