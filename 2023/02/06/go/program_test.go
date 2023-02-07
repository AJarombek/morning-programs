/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 2/6/2023
 */

package _go

import "testing"

func TestWordPattern(t *testing.T) {
	if !wordPattern("abba", "dog cat cat dog") {
		t.Errorf(`wordPattern("abba", "dog cat cat dog") != true`)
	}

	if wordPattern("abba", "dog cat cat fish") {
		t.Errorf(`wordPattern("abba", "dog cat cat fish") != false`)
	}
}
