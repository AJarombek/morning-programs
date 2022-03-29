// Program: https://leetcode.com/problems/remove-linked-list-elements/
// Author: Andrew Jarombek
// Date: 3/28/2022

#include <stdlib.h>
#include <assert.h>

struct ListNode {
    int val;
    struct ListNode *next;
};

struct ListNode* removeElements(struct ListNode* head, int val){
    while (head != NULL && head->val == val)
        head = head->next;

    if (head == NULL)
        return NULL;

    struct ListNode* node = head;

    while (node->next != NULL) {
        if (node->next->val == val) {
            node->next = node->next->next;
        } else {
            node = node->next;
        }
    }

    return head;
}

int main() {
    struct ListNode node7 = {6, NULL};
    struct ListNode node6 = {5, &node7};
    struct ListNode node5 = {4, &node6};
    struct ListNode node4 = {3, &node5};
    struct ListNode node3 = {6, &node4};
    struct ListNode node2 = {2, &node3};
    struct ListNode node1 = {1, &node2};

    struct ListNode* result = removeElements(&node1, 6);

    assert(result->val == 1);
    assert(result->next->val == 2);
    assert(result->next->next->val == 3);
    assert(result->next->next->next->val == 4);
    assert(result->next->next->next->next->val == 5);
    assert(result->next->next->next->next->next == NULL);
}
