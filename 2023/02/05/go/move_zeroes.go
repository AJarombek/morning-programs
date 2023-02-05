/**
 * https://leetcode.com/problems/move-zeroes/
 * Author: Andrew Jarombek
 * Date: 2/5/2023
 */

package _go

func moveZeroes(nums []int)  {
    i := 0

    for _, num := range nums {
        if num != 0 {
            nums[i] = num
            i++
        }
    }

    for index := i; index < len(nums); index++ {
        nums[index] = 0
    }
}
