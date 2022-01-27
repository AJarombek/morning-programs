// Program: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
// Author: Andrew Jarombek
// Date: 1/26/2022

#include <stddef.h>
#include <assert.h>

struct ListNode {
    int val;
    struct ListNode *next;
};

struct ListNode* deleteDuplicates(struct ListNode* head) {
    if (head == NULL) {
        return head;
    }

    struct ListNode* node = head;

    while (node->next != NULL) {
        if (node->val == node->next->val) {
            node->next = node->next->next;
        } else {
            node = node->next;
        }
    }

    return head;
}

int main() {
    struct ListNode node1 = {3, NULL};
    struct ListNode node2 = {2, &node1};
    struct ListNode node3 = {1, &node2};
    struct ListNode node4 = {1, &node3};

    struct ListNode* result = deleteDuplicates(&node4);
    assert(result->val == 1);
    assert(result->next->val == 2);
    assert(result->next->next->val == 3);
    assert(result->next->next->next == NULL);
}