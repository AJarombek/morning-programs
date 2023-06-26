/**
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 * Author: Andrew Jarombek
 * Date: 6/25/2023
 */

package _go

func findDisappearedNumbers(nums []int) []int {
	numbers := make(map[int]struct{})

	for _, num := range nums {
		numbers[num] = struct{}{}
	}

	result := make([]int, 0)

	for i := 1; i <= len(nums); i++ {
		if _, ok := numbers[i]; !ok {
			result = append(result, i)
		}
	}

	return result
}
