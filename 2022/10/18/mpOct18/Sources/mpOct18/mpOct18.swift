/**
 https://leetcode.com/problems/reverse-linked-list/
 https://leetcode.com/problems/contains-duplicate/
 - Author: Andrew Jarombek
 - Date: 10/18/2022
 */

public class ListNode {
    public var val: Int
    public var next: ListNode?
    public init() { val = 0; next = nil; }
    public init(_ val: Int) { self.val = val; next = nil; }
    public init(_ val: Int, _ next: ListNode?) { self.val = val; self.next = next; }
}

public struct mpOct18 {
    func reverseListV2(_ head: ListNode?) -> ListNode? {
        var node = head
        var result: ListNode? = nil

        while node != nil {
            let next = node?.next
            node?.next = result
            result = node
            node = next
        }

        return result
    }

    func reverseList(_ head: ListNode?) -> ListNode? {
        var node = head
        var result: ListNode? = nil

        while node != nil {
            let next = result
            result = ListNode(node?.val ?? 0, next)
            node = node?.next
        }

        return result
    }

    func containsDuplicate(_ nums: [Int]) -> Bool {
        var set = Set<Int>()

        for num in nums {
            if set.contains(num) {
                return true
            }

            set.insert(num)
        }

        return false
    }
}
