/**
 * https://leetcode.com/problems/assign-cookies/
 * Author: Andrew Jarombek
 * Date: 6/26/2023
 */

package _go

import "sort"

func findContentChildren(g []int, s []int) int {
	sort.Ints(g)
	sort.Ints(s)

	count := 0
	gIndex := 0
	sIndex := 0

	for gIndex < len(g) && sIndex < len(s) {
		if s[sIndex] >= g[gIndex] {
			count++
			gIndex++
		}

		sIndex++
	}

	return count
}
