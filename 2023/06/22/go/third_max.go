/**
 * https://leetcode.com/problems/third-maximum-number/
 * Author: Andrew Jarombek
 * Date: 6/22/2023
 */

package _go

func thirdMax(nums []int) int {
	first := nums[0]
	second := nums[0]
	third := nums[0]

	for _, num := range nums {
		if num > first {
			third = second
			second = first
			first = num
		} else if num > second && num != first {
			third = second
			second = num
		} else if num > third && num != second && num != first {
			third = num
		} else if num < first && first == second {
			third = num
			second = num
		} else if num < second && second == third {
			third = num
		}
	}

	if third == second || third == first {
		return first
	}

	return third
}
