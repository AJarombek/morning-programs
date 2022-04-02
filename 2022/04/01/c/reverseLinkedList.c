// Program: https://leetcode.com/problems/reverse-linked-list/
// Author: Andrew Jarombek
// Date: 4/1/2022

#include <stdlib.h>
#include <assert.h>

struct ListNode {
    int val;
    struct ListNode *next;
};

struct ListNode* reverseList(struct ListNode* head){
    if (head == NULL) {
        return NULL;
    }

    int length = 0;
    struct ListNode* node = head;

    while (node != NULL) {
        length++;
        node = node->next;
    }

    struct ListNode* result = malloc(sizeof(struct ListNode));
    result->val = head->val;
    result->next = NULL;

    node = head->next;

    while (node != NULL) {
        struct ListNode* temp = malloc(sizeof(struct ListNode));
        temp->val = node->val;
        temp->next = result;

        result = temp;
        node = node->next;
    }

    return result;
}

int main() {
    struct ListNode node5 = {5, NULL};
    struct ListNode node4 = {4, &node5};
    struct ListNode node3 = {3, &node4};
    struct ListNode node2 = {2, &node3};
    struct ListNode node1 = {1, &node2};

    struct ListNode* result = reverseList(&node1);

    assert(result->val == 5);
    assert(result->next->val == 4);
    assert(result->next->next->val == 3);
    assert(result->next->next->next->val == 2);
    assert(result->next->next->next->next->val == 1);
    assert(result->next->next->next->next->next == NULL);
}
