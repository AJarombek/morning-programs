/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 11/3/2022
 */

package _go

import "testing"

func TestIsomorphicStrings(t *testing.T) {
	if !isIsomorphic("egg", "add") {
		t.Errorf(`isIsomorphic("egg", "add") != true`)
	}

	if isIsomorphic("foo", "bar") {
		t.Errorf(`isIsomorphic("foo", "bar") != false`)
	}

	if !isIsomorphic("paper", "title") {
		t.Errorf(`isIsomorphic("paper", "title") != true`)
	}
}
