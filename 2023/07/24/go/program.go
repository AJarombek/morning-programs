/**
 * https://leetcode.com/problems/can-place-flowers/
 * Author: Andrew Jarombek
 * Date: 7/24/2023
 */

package _go

func canPlaceFlowers(flowerbed []int, n int) bool {
	index := 0
	for n > 0 && index < len(flowerbed) {
		prev := 0
		if index > 0 {
			prev = flowerbed[index-1]
		}
		next := 0
		if index < len(flowerbed)-1 {
			next = flowerbed[index+1]
		}

		if prev == 0 && next == 0 && flowerbed[index] == 0 {
			flowerbed[index] = 1
			n--
		}

		index++
	}

	return n == 0
}
