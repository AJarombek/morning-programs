// https://leetcode.com/problems/merge-sorted-array/
// Author: Andrew Jarombek
// Date: 3/8/2022

func merge(_ nums1: inout [Int], _ m: Int, _ nums2: [Int], _ n: Int) {
    var i1 = m - 1
    var i2 = n - 1
    var index = m + n - 1

    while index >= 0 {
        let x = i1 >= 0 ? nums1[i1] : nums2[i2] - 1
        let y = i2 >= 0 ? nums2[i2] : nums1[i1] - 1

        if x > y {
            i1 -= 1
            nums1[index] = x
        } else {
            i2 -= 1
            nums1[index] = y
        }

        index -= 1
    }
}