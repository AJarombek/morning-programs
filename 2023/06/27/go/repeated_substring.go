/**
 * https://leetcode.com/problems/repeated-substring-pattern/
 * Author: Andrew Jarombek
 * Date: 6/27/2023
 */

package _go

func repeatedSubstringPattern(s string) bool {
	for i := 1; i <= len(s)/2; i++ {
		if len(s)%i == 0 {
			sub := s[0:i]
			repeated := true

			for j := i; j < len(s); j += i {
				if sub != s[j:j+i] {
					repeated = false
					break
				}
			}

			if repeated {
				return true
			}
		}
	}

	return false
}
