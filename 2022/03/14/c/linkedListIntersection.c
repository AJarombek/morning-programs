// Program: https://leetcode.com/problems/intersection-of-two-linked-lists/
// Author: Andrew Jarombek
// Date: 3/14/2022

#include <stdlib.h>

struct ListNode {
    int val;
    struct ListNode* next;
};

struct ListNode* getIntersectionNode(struct ListNode* headA, struct ListNode* headB) {
    int aLength = 0;
    struct ListNode *nodeA = headA;
    struct ListNode *nodeB = headB;

    while (nodeA != NULL) {
        aLength++;
        nodeA = nodeA->next;
    }

    int bLength = 0;

    while (nodeB != NULL) {
        bLength++;
        nodeB = nodeB->next;
    }

    for (int i = aLength - bLength; i > 0; i--) {
        headA = headA->next;
    }

    for (int i = bLength - aLength; i > 0; i--) {
        headB = headB->next;
    }

    while (headA != NULL) {
        if (headA == headB) {
            return headA;
        }

        headA = headA->next;
        headB = headB->next;
    }

    return NULL;
}

int main() {}
