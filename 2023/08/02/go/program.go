/**
 * https://leetcode.com/problems/robot-return-to-origin/
 * Author: Andrew Jarombek
 * Date: 8/2/2023
 */

package _go

func judgeCircle(moves string) bool {
	var x, y int

	for _, move := range moves {
		if move == 'U' {
			y++
		} else if move == 'D' {
			y--
		} else if move == 'R' {
			x++
		} else {
			x--
		}
	}

	return x == 0 && y == 0
}
