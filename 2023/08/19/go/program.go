/**
 * https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/
 * Author: Andrew Jarombek
 * Date: 8/19/2023
 */

package _go

func countPrimeSetBits(left int, right int) int {
	result := 0

	for i := left; i <= right; i++ {
		n := i
		count := 0

		for n > 0 {
			if n%2 == 1 {
				count++
			}

			n >>= 1
		}

		if isPrime(count) {
			result++
		}
	}

	return result
}

func isPrime(num int) bool {
	if num <= 3 {
		return num > 1
	}

	if num%2 == 0 || num%3 == 0 {
		return false
	}

	for i := 5; i*i <= num; i++ {
		if num%i == 0 {
			return false
		}
	}

	return true
}
