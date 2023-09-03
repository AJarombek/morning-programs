/**
 * https://leetcode.com/problems/number-of-lines-to-write-string/
 * Author: Andrew Jarombek
 * Date: 9/3/2023
 */

package _go

func numberOfLines(widths []int, s string) []int {
	line := 1
	width := 0

	for _, c := range s {
		value := widths[int(c-'a')]

		if width+value > 100 {
			line++
			width = value
		} else {
			width += value
		}
	}

	return []int{line, width}
}
