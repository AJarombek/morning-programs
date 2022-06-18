/**
 * The Go Programming Language: Section 3.5
 * Author: Andrew Jarombek
 * Date: 6/17/2022
 */

package _go

import (
	"bytes"
	"fmt"
	"github.com/stretchr/testify/assert"
	"testing"
	"unicode/utf8"
)

// Exercise 3.10
func comma(s string) string {
	var buf bytes.Buffer
	i := 0
	j := len(s) - 1

	for i < len(s) {
		buf.WriteByte(s[i])

		if j > 0 && j % 3 == 0 {
			buf.WriteByte(',')
		}

		i++
		j--
	}

	return buf.String()
}

func TestSampleCode(t *testing.T) {
	// Unicode in Golang
	s := "😺😻"

	assert.Equal(t, 8, len(s))
	assert.Equal(t, 2, utf8.RuneCountInString(s))

	r, size := utf8.DecodeRuneInString(s)
	assert.Equal(t, "😺", string(r))
	assert.Equal(t, 4, size)

	// for..range loops loop over runes (unicode characters), not bytes
	index := 0
	for i, emoji := range s {
		fmt.Printf("%d.  Character at index %d: %q\n", index, i, emoji)
		index++
	}

	assert.Equal(t, "1", comma("1"))
	assert.Equal(t, "10", comma("10"))
	assert.Equal(t, "100", comma("100"))
	assert.Equal(t, "1,000", comma("1000"))
	assert.Equal(t, "10,000", comma("10000"))
	assert.Equal(t, "100,000", comma("100000"))
	assert.Equal(t, "1,000,000", comma("1000000"))

	// Constants with 'iota'
	const (
		Run = iota
		Bike
		Kayak
	)

	assert.Equal(t, 0, Run)
	assert.Equal(t, 1, Bike)
	assert.Equal(t, 2, Kayak)

	// Bits in Java integer types
	const (
		Byte = 8 << iota
		Short
		Int
		Long
	)

	assert.Equal(t, 8, Byte)
	assert.Equal(t, 16, Short)
	assert.Equal(t, 32, Int)
	assert.Equal(t, 64, Long)
}