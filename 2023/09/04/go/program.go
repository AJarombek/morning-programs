/**
 * https://leetcode.com/problems/largest-triangle-area/
 * Author: Andrew Jarombek
 * Date: 9/4/2023
 */

package _go

import "math"

func largestTriangleArea(points [][]int) float64 {
	result := 0.0

	for i := 0; i < len(points); i++ {
		for j := 0; j < len(points); j++ {
			for k := 0; k < len(points); k++ {
				oneX := float64(points[i][0])
				oneY := float64(points[i][1])
				twoX := float64(points[j][0])
				twoY := float64(points[j][1])
				threeX := float64(points[k][0])
				threeY := float64(points[k][1])

				area := math.Abs(oneX*twoY+twoX*threeY+threeX*oneY-oneY*twoX-twoY*threeX-threeY*oneX) / 2.0
				if area > result {
					result = area
				}
			}
		}
	}

	return result
}
