/**
 * https://leetcode.com/problems/contains-duplicate/
 * https://leetcode.com/problems/contains-duplicate-ii/
 * Author: Andrew Jarombek
 * Date: 11/5/2022
 */

package _go

func containsDuplicate(nums []int) bool {
	chars := make(map[int]struct{})

	for _, num := range nums {
		if _, ok := chars[num]; ok {
			return true
		}

		chars[num] = struct{}{}
	}

	return false
}

func containsNearbyDuplicate(nums []int, k int) bool {
	chars := make(map[int]struct{})

	for i, num := range nums {
		start := i - k - 1

		if start >= 0 {
			c := nums[start]
			delete(chars, c)
		}

		if _, ok := chars[num]; ok {
			return true
		}

		chars[num] = struct{}{}
	}

	return false
}
