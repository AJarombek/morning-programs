// https://leetcode.com/problems/climbing-stairs/
// Author: Andrew Jarombek
// Date: 4/12/2022

#include "Solution.h"

int Solution::climbStairs(int n) {
    if (n < 3) {
        return n;
    }

    int previous = 1;
    int current = 2;
    int i = 3;

    while (i <= n) {
        int next = previous + current;
        previous = current;
        current = next;
        i++;
    }

    return current;
}

ListNode* Solution::deleteDuplicates(ListNode* head) {
    if (head == nullptr) {
        return head;
    }

    ListNode* node = new ListNode(head->val);
    ListNode* result = node;
    ListNode* current = head->next;

    while (current != nullptr) {
        if (current->val != node->val) {
            ListNode* next = new ListNode(current->val);
            node->next = next;
            node = node->next;
        }

        current = current->next;
    }

    return result;
}