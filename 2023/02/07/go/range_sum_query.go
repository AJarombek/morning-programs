/**
 * https://leetcode.com/problems/range-sum-query-immutable/
 * Author: Andrew Jarombek
 * Date: 2/7/2023
 */

package _go

type NumArray struct {
	Values []int
}

func Constructor(nums []int) NumArray {
	return NumArray{Values: nums}
}

func (numArray *NumArray) SumRange(left int, right int) int {
	result := 0

	for i := left; i <= right; i++ {
		result += numArray.Values[i]
	}

	return result
}
