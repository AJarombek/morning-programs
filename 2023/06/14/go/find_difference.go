/**
 * https://leetcode.com/problems/find-the-difference/
 * Author: Andrew Jarombek
 * Date: 6/14/2023
 */

package _go

func findTheDifference(s string, t string) byte {
	sMap := make(map[byte]int)

	for i := 0; i < len(s); i++ {
		sMap[s[i]]++
	}

	for i := 0; i < len(t); i++ {
		if _, ok := sMap[t[i]]; !ok {
			return t[i]
		} else {
			sMap[t[i]]--
		}
	}

	for k, v := range sMap {
		if v != 0 {
			return k
		}
	}

	return ' '
}
