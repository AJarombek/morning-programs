/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 2/9/2023
 */

package _go

import "testing"

func TestPowerOfFour(t *testing.T) {
	if !isPowerOfFour(16) {
		t.Errorf(`isPowerOfThree(16) != true`)
	}

	if isPowerOfFour(5) {
		t.Errorf(`isPowerOfThree(5) != false`)
	}

	if !isPowerOfFour(1) {
		t.Errorf(`isPowerOfThree(1) != true`)
	}
}
