// Program: https://leetcode.com/problems/linked-list-cycle/
// Author: Andrew Jarombek
// Date: 2/17/2022

#include <stdbool.h>
#include <stdlib.h>
#include <assert.h>

struct ListNode {
    int val;
    struct ListNode *next;
};

bool hasCycle(struct ListNode *head) {
    struct ListNode* node = head;
    int index = 0;

    while (node != NULL) {
        struct ListNode* prev = head;
        for (int i = 0; i < index; i++) {
            if (prev == node) {
                return true;
            }

            prev = prev->next;
        }

        index++;
        node = node->next;
    }

    return false;
}

int main() {
    struct ListNode node2 = { .val = 2, .next = NULL };
    struct ListNode node1 = {1, &node2 };

    assert(!hasCycle(&node1));

    node2.next = &node1;
    assert(hasCycle(&node1));
}
