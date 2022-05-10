/**
 * The Go Programming Language: Exercises 1.4
 * Author: Andrew Jarombek
 * Date: 5/9/2022
 */

package main

import (
	"bufio"
	"fmt"
	"os"
)

// Exercise 1.4
type line struct {
	Count int
	Files []string
}

func countLines(f *os.File, counts map[string]line) {
	input := bufio.NewScanner(f)
	for input.Scan() {
		text := input.Text()
		item := counts[text]
		item.Count++
		item.Files = append(item.Files, f.Name())
		counts[text] = item
	}
}

func main() {
	counts := make(map[string]line)
	files := []string {"./potential_miles_q2.yaml", "./potential_miles_q3.yaml", "./potential_miles_q4.yaml"}
	for _, arg := range files {
		f, err := os.Open(arg)

		if err != nil {
			fmt.Println("Failed to open file " + arg)
			continue
		}

		countLines(f, counts)
		f.Close()
	}

	for lineStr, lineItem := range counts {
		if lineItem.Count > 1 {
			fmt.Printf("%s\t%d\t%s\n", lineStr, lineItem.Count, lineItem.Files)
		}
	}
}