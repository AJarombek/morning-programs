/**
 * https://leetcode.com/problems/base-7/
 * Author: Andrew Jarombek
 * Date: 7/9/2023
 */

package _go

import (
	"sort"
	"strconv"
)

func findRelativeRanks(score []int) []string {
	sorted := make([]int, len(score))
	copy(sorted, score)

	sort.Slice(sorted, func(i, j int) bool {
		return sorted[i] > sorted[j]
	})

	rankMap := make(map[int]string)

	for i, s := range sorted {
		switch i {
		case 0:
			rankMap[s] = "Gold Medal"
		case 1:
			rankMap[s] = "Silver Medal"
		case 2:
			rankMap[s] = "Bronze Medal"
		default:
			rankMap[s] = strconv.Itoa(i + 1)
		}
	}

	ranks := make([]string, len(score))
	for i, s := range score {
		ranks[i] = rankMap[s]
	}

	return ranks
}
