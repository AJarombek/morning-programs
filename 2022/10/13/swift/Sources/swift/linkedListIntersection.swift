/**
 https://leetcode.com/problems/intersection-of-two-linked-lists/
 - Author: Andrew Jarombek
 - Date: 10/13/2022
 */

public class ListNode {
    public var val: Int
    public var next: ListNode?
    public init(_ val: Int) {
        self.val = val
        self.next = nil
    }
}

class Solution {
    func getIntersectionNode(_ headA: ListNode?, _ headB: ListNode?) -> ListNode? {
        var a = 0
        var b = 0

        var nodeA = headA
        var nodeB = headB

        while nodeA != nil {
            nodeA = nodeA?.next
            a += 1
        }

        while nodeB != nil {
            nodeB = nodeB?.next
            b += 1
        }

        nodeA = headA
        nodeB = headB

        while a > b {
            nodeA = nodeA?.next
            a -= 1
        }

        while b > a {
            nodeB = nodeB?.next
            b -= 1
        }

        while nodeA != nil {
            if nodeA === nodeB {
                return nodeA
            }

            nodeA = nodeA?.next
            nodeB = nodeB?.next
        }

        return nil
    }
}