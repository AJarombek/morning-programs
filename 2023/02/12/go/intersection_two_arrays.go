/**
 * https://leetcode.com/problems/intersection-of-two-arrays/
 * Author: Andrew Jarombek
 * Date: 2/12/2023
 */

package _go

func intersection(nums1 []int, nums2 []int) []int {
	set1 := make(map[int]int)
	set2 := make(map[int]int)

	for _, num := range nums1 {
		set1[num] = 1
	}

	for _, num := range nums2 {
		set2[num] = 1
	}

	result := []int{}

	for key, _ := range set1 {
		if set2[key] == 1 {
			result = append(result, key)
		}
	}

	return result
}
