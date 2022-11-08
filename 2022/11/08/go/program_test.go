/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 11/8/2022
 */

package _go

import "testing"

func TestSummaryRanges(t *testing.T) {
	result := summaryRanges([]int{0, 1, 2, 4, 5, 7})
	expected := []string{"0->2", "4->5", "7"}

	if len(result) != len(expected) {
		t.Errorf(`result length %d != expected length %d`, len(result), len(expected))
	}

	for i, expectedVal := range expected {
		resultVal := result[i]

		if expectedVal != resultVal {
			t.Errorf(`result value %s != expected value %s`, resultVal, expectedVal)
		}
	}
}
