/**
 * The Go Programming Language: Exercises 1.7 - 1.9
 * Author: Andrew Jarombek
 * Date: 5/12/2022
 */

package main

import (
	"fmt"
	"io"
	"net/http"
	"os"
	"strings"
)

func main() {
	urls := []string {"saintsxctf.com", "jarombek.com", "https://api.saintsxctf.com"}
	prefix := "https://"

	for _, url := range urls {
		if !strings.HasPrefix(url, prefix) {
			url = prefix + url
		}

		resp, err := http.Get(url)
		fmt.Printf("Fetching URL: %s\n", url)

		if err != nil {
			fmt.Fprintf(os.Stderr, "Fetch %v\n", err)
			os.Exit(1)
		}

		if _, err := io.Copy(os.Stdout, resp.Body); err != nil {
			fmt.Fprintf(os.Stderr, "Fetch: reading %s: %v\n", url, err)
			resp.Body.Close()
			os.Exit(1)
		}

		fmt.Printf("Status: %s\n", resp.Status)
		resp.Body.Close()
	}
}