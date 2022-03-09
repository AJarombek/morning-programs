// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
// Author: Andrew Jarombek
// Date: 3/8/2022

func deleteDuplicates(_ head: ListNode?) -> ListNode? {
    var node = head

    while (node?.next != nil) {
        let next = node?.next

        if (node?.val == next?.val) {
            node?.next = next?.next
        } else {
            node = next
        }
    }

    return head
}
