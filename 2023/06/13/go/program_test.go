/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 6/13/2023
 */

package _go

import "testing"

func TestFirstUniqChar(t *testing.T) {
	word1 := "pizza"
	expected1 := 0
	result1 := firstUniqChar(word1)
	if result1 != expected1 {
		t.Errorf("firstUniqChar(%q) = %d; expected %d", word1, result1, expected1)
	}

	word2 := "pepperoni"
	expected2 := 5
	result2 := firstUniqChar(word2)
	if result2 != expected2 {
		t.Errorf("firstUniqChar(%q) = %d; expected %d", word2, result2, expected2)
	}
}
