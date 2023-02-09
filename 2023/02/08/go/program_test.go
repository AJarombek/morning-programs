/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 2/8/2023
 */

package _go

import "testing"

func TestPowerOfThree(t *testing.T) {
	if !isPowerOfThree(27) {
		t.Errorf(`isPowerOfThree(27) != true`)
	}

	if isPowerOfThree(0) {
		t.Errorf(`isPowerOfThree(0) != false`)
	}

	if isPowerOfThree(-1) {
		t.Errorf(`isPowerOfThree(-1) != false`)
	}
}

func TestCountBits(t *testing.T) {
	result := countBits(2)

	if result[0] != 0 {
		t.Errorf(`countBits(2)[0] != 0`)
	}
	if result[1] != 1 {
		t.Errorf(`countBits(2)[1] != 1`)
	}
	if result[2] != 1 {
		t.Errorf(`countBits(2)[2] != 1`)
	}
}
