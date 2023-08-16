/**
 * https://leetcode.com/problems/min-cost-climbing-stairs/
 * Author: Andrew Jarombek
 * Date: 8/16/2023
 */

package _go

import "math"

func minCostClimbingStairs(cost []int) int {
	i := 2

	for i < len(cost) {
		cost[i] += int(math.Min(float64(cost[i-1]), float64(cost[i-2])))
		i++
	}

	return int(math.Min(float64(cost[len(cost)-1]), float64(cost[len(cost)-2])))
}
