/**
 * https://leetcode.com/problems/intersection-of-two-arrays/
 * Author: Andrew Jarombek
 * Date: 6/10/2023
 */

package _go

func intersect(nums1 []int, nums2 []int) []int {
	var chars = make(map[int]int)

	for _, num := range nums1 {
		chars[num] = chars[num] + 1
	}

	var result []int

	for _, num := range nums2 {
		if chars[num] > 0 {
			result = append(result, num)
			chars[num] = chars[num] - 1
		}
	}

	return result
}
