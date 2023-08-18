/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/18/2023
 */

package _go

import (
	"testing"
)

func TestShortestCompletingWord(t *testing.T) {
	licensePlate := "1s3 PSt"
	words := []string{"step", "steps", "stripe", "stepple"}
	expected := "steps"

	result := shortestCompletingWord(licensePlate, words)

	if result != expected {
		t.Errorf("Expected '%s', but got '%s'", expected, result)
	}
}

func TestShortestCompletingWordEmptyWords(t *testing.T) {
	licensePlate := "1s3 PSt"
	words := []string{}
	expected := ""

	result := shortestCompletingWord(licensePlate, words)

	if result != expected {
		t.Errorf("Expected '%s', but got '%s'", expected, result)
	}
}
