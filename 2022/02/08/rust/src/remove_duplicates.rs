// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
// Author: Andrew Jarombek
// Date: 2/8/2022

#[derive(PartialEq, Eq, Clone, Debug)]
pub struct ListNode {
    pub val: i32,
    pub next: Option<Box<ListNode>>
}

impl ListNode {
    #[inline]
    fn new(val: i32) -> Self {
        ListNode {
            next: None,
            val
        }
    }
}

pub fn delete_duplicates(head: Option<Box<ListNode>>) -> Option<Box<ListNode>> {
    if head.is_none() {
        return head;
    }

    let mut n = head;
    let mut node = n.as_mut().unwrap();

    while let Some(next) = node.next.as_mut() {
        if node.val == next.val {
            node.next = next.next.take();
        } else {
            node = node.next.as_mut().unwrap();
        }
    }

    return n;
}