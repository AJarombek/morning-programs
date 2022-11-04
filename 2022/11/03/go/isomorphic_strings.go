/**
 * https://leetcode.com/problems/isomorphic-strings/
 * Author: Andrew Jarombek
 * Date: 11/3/2022
 */

package _go

func isIsomorphic(s string, t string) bool {
	chars := map[string]string{}
	set := map[string]struct{}{}

	for i, c := range s {
		c1 := string(c)
		c2 := string(t[i])

		if val, ok := chars[c1]; ok {
			if val != c2 {
				return false
			}
		} else {
			if _, ok := set[c2]; ok {
				return false
			}

			set[c2] = struct{}{}
			chars[c1] = c2
		}
	}

	return true
}
