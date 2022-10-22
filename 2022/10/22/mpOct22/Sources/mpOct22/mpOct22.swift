/**
 https://leetcode.com/problems/palindrome-linked-list/
 - Author: Andrew Jarombek
 - Date: 10/22/2022
 */

public class ListNode {
    public var val: Int
    public var next: ListNode?
    public init(_ val: Int) {
        self.val = val
        self.next = nil
    }
    public init(_ val: Int, _ next: ListNode?) {
        self.val = val;
        self.next = next;
    }
}

public struct mpOct22 {
    func isPalindrome(_ head: ListNode?) -> Bool {
        var length = 0
        var node = head

        while node != nil {
            length += 1
            node = node?.next
        }

        node = head
        var vals: [Int] = []

        for _ in 0..<length / 2 {
            vals.append(node?.val ?? -1)
            node = node?.next
        }

        if length % 2 == 1 {
            node = node?.next
        }

        while node != nil {
            let val = vals.popLast()
            if node?.val != val {
                return false
            }

            node = node?.next
        }

        return true
    }
}
