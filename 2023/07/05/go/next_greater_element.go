/**
 * https://leetcode.com/problems/construct-the-rectangle/
 * Author: Andrew Jarombek
 * Date: 7/5/2023
 */

package _go

func nextGreaterElement(nums1 []int, nums2 []int) []int {
	var stack []int
	dict := make(map[int]int)

	for _, num := range nums2 {
		for len(stack) > 0 && stack[len(stack)-1] < num {
			dict[stack[len(stack)-1]] = num
			stack = stack[:len(stack)-1]
		}

		stack = append(stack, num)
	}

	var result []int

	for _, num := range nums1 {
		if value, ok := dict[num]; ok {
			result = append(result, value)
		} else {
			result = append(result, -1)
		}
	}

	return result
}
