/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 2/10/2023
 */

package _go

import "testing"

func TestReverseString(t *testing.T) {
	str := []byte{'h', 'e', 'l', 'l', 'o'}
	reverseString(str)

	if str[0] != 'o' {
		t.Errorf(`str[0] != 'o'`)
	}
	if str[1] != 'l' {
		t.Errorf(`str[1] != 'l'`)
	}
	if str[2] != 'l' {
		t.Errorf(`str[2] != 'l'`)
	}
	if str[3] != 'e' {
		t.Errorf(`str[3] != 'e'`)
	}
	if str[4] != 'h' {
		t.Errorf(`str[4] != 'h'`)
	}
}
