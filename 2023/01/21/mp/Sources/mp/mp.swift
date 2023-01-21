/**
 https://leetcode.com/problems/reverse-vowels-of-a-string/
 https://leetcode.com/problems/intersection-of-two-arrays/
 - Author: Andrew Jarombek
 - Date: 1/21/2023
 */

public class MorningPrograms {
    func reverseVowels(_ s: String) -> String {
        var start = 0
        var end = s.count - 1
        var chars = Array(s)
        let vowels: Set<Character> = ["a", "e", "i", "o", "u", "A", "E", "I", "O", "U"]

        while start < end {
            while start < end && !vowels.contains(chars[start]) {
                start += 1
            }

            while end > start && !vowels.contains(chars[end]) {
                end -= 1
            }

            let temp = chars[start]
            chars[start] = chars[end]
            chars[end] = temp

            start += 1
            end -= 1
        }

        return String(chars)
    }

    func intersection(_ nums1: [Int], _ nums2: [Int]) -> [Int] {
        var set: Set<Int> = []

        for num in nums1 {
            set.insert(num)
        }

        var result: [Int] = []
        for num in nums2 {
            if set.contains(num) {
                result.append(num)
                set.remove(num)
            }
        }

        return result
    }
}
