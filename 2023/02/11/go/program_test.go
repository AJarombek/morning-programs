/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 2/11/2023
 */

package _go

import "testing"

func TestReverseVowelsString(t *testing.T) {
	if reverseVowels("hello") != "holle" {
		t.Errorf(`reverseVowels("hello") != "holle"`)
	}
}
