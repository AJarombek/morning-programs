/**
 * https://leetcode.com/problems/student-attendance-record-i/
 * Author: Andrew Jarombek
 * Date: 7/14/2023
 */

package _go

func checkRecord(s string) bool {
	absent := 0
	late := 0

	for _, c := range s {
		if c == 'A' {
			absent++
			late = 0
		} else if c == 'L' {
			late++
		} else {
			late = 0
		}

		if absent >= 2 || late >= 3 {
			return false
		}
	}

	return true
}
