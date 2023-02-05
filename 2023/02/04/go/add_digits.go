/**
 * https://leetcode.com/problems/add-digits/
 * Author: Andrew Jarombek
 * Date: 2/4/2023
 */

package _go

func addDigits(num int) int {
    result := num

    for result > 9 {
        n := result
        result = 0

        for n > 0 {
            result += n % 10
            n /= 10
        }
    }

    return result
}
