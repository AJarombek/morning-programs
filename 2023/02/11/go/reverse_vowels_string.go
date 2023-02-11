/**
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 * Author: Andrew Jarombek
 * Date: 2/11/2023
 */

package _go

func reverseVowels(s string) string {
	chars := []byte(s)
	vowels := make(map[byte]int)

	vowels['a'] = 1
	vowels['e'] = 1
	vowels['i'] = 1
	vowels['o'] = 1
	vowels['u'] = 1

	vowels['A'] = 1
	vowels['E'] = 1
	vowels['I'] = 1
	vowels['O'] = 1
	vowels['U'] = 1

	i := 0
	j := len(chars) - 1

	for i < j {
		for i < j && vowels[chars[i]] == 0 {
			i++
		}

		for i < j && vowels[chars[j]] == 0 {
			j--
		}

		if i < j {
			chars[i], chars[j] = chars[j], chars[i]
			i++
			j--
		}
	}

	return string(chars[:])
}
