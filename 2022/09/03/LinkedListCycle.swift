/**
 https://leetcode.com/problems/linked-list-cycle/
 - Author: Andrew Jarombek
 - Date: 9/3/2022
 */
 
class ListNode {
    public var val: Int
    public var next: ListNode?
    public init(_ val: Int) {
        self.val = val
        self.next = nil
    }
}

class Solution {
    func hasCycle(_ head: ListNode?) -> Bool {
        var slow = head
        var fast = head?.next

        while fast != nil {
            if slow === fast {
                return true
            }

            slow = slow?.next
            fast = fast?.next?.next
        }

        return false
    }
}

let solution = Solution()

let node = ListNode(1)
var result = solution.hasCycle(node)
print(result)

let nextNode = ListNode(2)
node.next = nextNode

result = solution.hasCycle(node)
print(result)
