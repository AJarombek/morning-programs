/**
 * https://leetcode.com/problems/construct-the-rectangle/
 * Author: Andrew Jarombek
 * Date: 7/3/2023
 */

package _go

func constructRectangle(area int) []int {
	var width int
	var length int

	i := 1

	for i*i <= area {
		if area%i == 0 {
			width = i
			length = area / i
		}

		i++
	}

	return []int{length, width}
}
