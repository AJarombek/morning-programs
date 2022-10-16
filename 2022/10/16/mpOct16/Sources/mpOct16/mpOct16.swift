/**
 https://leetcode.com/problems/reverse-bits/
 https://leetcode.com/problems/number-of-1-bits/
 https://leetcode.com/problems/remove-linked-list-elements/
 - Author: Andrew Jarombek
 - Date: 10/16/2022
 */

public class ListNode {
    public var val: Int
    public var next: ListNode?
    public init() { val = 0; next = nil; }
    public init(_ val: Int) { self.val = val; next = nil; }
    public init(_ val: Int, _ next: ListNode?) { self.val = val; self.next = next; }
}

public struct mpOct16 {
    func reverseBits(_ n: Int) -> Int {
        var num = n
        var result = 0

        for _ in 0..<32 {
            result <<= 1
            result += num & 1
            num >>= 1
        }

        return result
    }

    func hammingWeight(_ n: Int) -> Int {
        var num = n
        var result = 0

        while num > 0 {
            result += num & 1
            num >>= 1
        }

        return result
    }

    func removeElements(_ head: ListNode?, _ val: Int) -> ListNode? {
        var result = head

        while result?.val == val {
            result = result?.next
        }

        var prev = result
        var node = result?.next

        while node != nil {
            if node?.val == val {
                prev?.next = node?.next
            } else {
                prev = node
            }

            node = node?.next
        }

        return result
    }
}
