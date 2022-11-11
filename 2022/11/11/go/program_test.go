/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 11/11/2022
 */

package _go

import "testing"

func TestIsAnagram(t *testing.T) {
	if !isAnagram("andy", "dany") {
		t.Errorf(`isAnagram("andy", "dany") != true`)
	}
}
