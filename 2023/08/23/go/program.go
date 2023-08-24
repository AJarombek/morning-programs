/**
 * https://leetcode.com/problems/jewels-and-stones/
 * Author: Andrew Jarombek
 * Date: 8/23/2023
 */

package _go

func numJewelsInStones(jewels string, stones string) int {
	jewelMap := make(map[rune]bool)

	for _, jewel := range jewels {
		jewelMap[jewel] = true
	}

	count := 0

	for _, stone := range stones {
		if jewelMap[stone] {
			count++
		}
	}

	return count
}
