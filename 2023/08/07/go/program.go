/**
 * https://leetcode.com/problems/baseball-game/
 * Author: Andrew Jarombek
 * Date: 8/7/2023
 */

package _go

import "strconv"

func calPoints(operations []string) int {
	var record []int

	for _, operation := range operations {
		if operation == "+" {
			record = append(record, record[len(record)-1]+record[len(record)-2])
		} else if operation == "D" {
			record = append(record, record[len(record)-1]*2)
		} else if operation == "C" {
			record = record[:len(record)-1]
		} else {
			value, _ := strconv.Atoi(operation)
			record = append(record, value)
		}
	}

	result := 0

	for _, value := range record {
		result += value
	}

	return result
}
