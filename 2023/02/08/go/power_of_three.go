/**
 * https://leetcode.com/problems/power-of-three/
 * Author: Andrew Jarombek
 * Date: 2/8/2023
 */

package _go

func isPowerOfThree(n int) bool {
    if n < 1 {
        return false
    }

    for n > 1 {
        if n % 3 != 0 {
            return false
        }

        n /= 3
    }

    return true
}
