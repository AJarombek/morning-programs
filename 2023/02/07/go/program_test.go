/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 2/7/2023
 */

package _go

import "testing"

func TestSumRange(t *testing.T) {
	numArray := Constructor([]int{-2, 0, 3, -5, 2, -1})

	if numArray.SumRange(0, 2) != 1 {
		t.Errorf(`numArray.SumRange(0, 2) != 1`)
	}

	if numArray.SumRange(2, 5) != -1 {
		t.Errorf(`numArray.SumRange(2, 5) != -1`)
	}
}
