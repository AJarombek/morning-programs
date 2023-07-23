/**
 * https://leetcode.com/problems/minimum-index-sum-of-two-lists/
 * Author: Andrew Jarombek
 * Date: 7/23/2023
 */

package _go

func findRestaurant(list1 []string, list2 []string) []string {
	map1 := make(map[string]int)

	for index, word := range list1 {
		map1[word] = index
	}

	var result []string
	value := 2000

	for i, word := range list2 {
		if j, ok := map1[word]; ok {
			if i+j == value {
				result = append(result, word)
			} else if i+j < value {
				value = i + j
				result = []string{word}
			}
		}
	}

	return result
}
