/**
 * Test the morning programs
 * Author: Andrew Jarombek
 * Date: 8/14/2023
 */

package _go

import (
	"reflect"
	"testing"
)

func TestFloodFill(t *testing.T) {
	image := [][]int{
		{1, 1, 1},
		{1, 1, 0},
		{1, 0, 1},
	}
	sr, sc, newColor := 1, 1, 2

	expected := [][]int{
		{2, 2, 2},
		{2, 2, 0},
		{2, 0, 1},
	}

	floodFill(image, sr, sc, newColor)

	if !reflect.DeepEqual(image, expected) {
		t.Errorf("Expected %v, but got %v", expected, image)
	}

	image = [][]int{
		{0, 0, 0},
		{0, 1, 1},
	}
	sr, sc, newColor = 1, 1, 1

	expected = [][]int{
		{0, 0, 0},
		{0, 1, 1},
	}

	floodFill(image, sr, sc, newColor)

	if !reflect.DeepEqual(image, expected) {
		t.Errorf("Expected %v, but got %v", expected, image)
	}
}
