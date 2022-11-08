/**
 * https://leetcode.com/problems/invert-binary-tree/
 * Author: Andrew Jarombek
 * Date: 11/8/2022
 */

package _go

import "fmt"

func summaryRanges(nums []int) []string {
	if len(nums) == 0 {
		return []string{}
	}

	var result []string
	start := nums[0]
	end := nums[0]

	for _, num := range nums[1:] {
		if num != end+1 {
			if start == end {
				result = append(result, fmt.Sprintf("%d", end))
			} else {
				result = append(result, fmt.Sprintf("%d->%d", start, end))
			}

			start = num
		}

		end = num
	}

	if start == end {
		result = append(result, fmt.Sprintf("%d", end))
	} else {
		result = append(result, fmt.Sprintf("%d->%d", start, end))
	}

	return result
}
