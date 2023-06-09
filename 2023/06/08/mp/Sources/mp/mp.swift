/**
 https://leetcode.com/problems/next-greater-element-i/
 - Author: Andrew Jarombek
 - Date: 6/8/2023
 */

import Foundation

public class MorningPrograms {
    func nextGreaterElement(_ nums1: [Int], _ nums2: [Int]) -> [Int] {
        var result = [Int]()

        for num in nums1 {
            var found = false
            var greater = -1

            for i in 0..<nums2.count {
                if nums2[i] == num {
                    found = true
                }

                if found && nums2[i] > num {
                    greater = nums2[i]
                    break
                }
            }

            result.append(greater)
        }

        return result
    }
}
