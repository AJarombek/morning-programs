/**
 * The Go Programming Language: Exercises 1.1 - 1.3
 * Author: Andrew Jarombek
 * Date: 5/8/2022
 */

package main

import (
	"fmt"
	"os"
	"strconv"
	"strings"
	"time"
)

// Exercise 1.1
func echo() {
	fmt.Println(len(os.Args))
	fmt.Println(strings.Join(os.Args, " "))
}

// Exercise 1.2
func echo2()  {
	for i, val := range os.Args {
		fmt.Println(strconv.Itoa(i + 1) + ". " + val)
	}
}

// Exercise 1.3
func timeIt(f func()) float64 {
	var total float64
	for i := 0; i < 100; i++ {
		start := time.Now()

		f()

		total += time.Since(start).Seconds()
	}

	return total / 100
}

func fastEcho()  {
	fmt.Println(strings.Join(os.Args[1:], " "))
}

func slowEcho()  {
	s, sep := "", ""
	for _, arg := range os.Args[1:] {
		s += sep + arg
		sep = " "
	}

	fmt.Println(s)
}

func main() {
	os.Args = append(os.Args, "arg1")
	os.Args = append(os.Args, "arg2")
	os.Args = append(os.Args, "arg3")

	fastTime := fmt.Sprintf("%f", timeIt(fastEcho))
	slowTime := fmt.Sprintf("%f", timeIt(slowEcho))

	fmt.Println("Slow Time: " + slowTime)
	fmt.Println("Fast Time: " + fastTime)

	echo()
	echo2()
}