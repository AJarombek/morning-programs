// https://leetcode.com/problems/number-of-1-bits/
// Author: Andrew Jarombek
// Date: 3/28/2023

#include <cassert>

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

ListNode* removeElements(ListNode* head, int val) {
    while (head != nullptr && head->val == val) {
        head = head->next;
    }

    if (head == nullptr)
        return nullptr;

    ListNode* prev = head;
    ListNode* node = prev->next;

    while (node != nullptr) {
        if (node->val == val) {
            node = node->next;
            prev->next = node;
        } else {
            prev = node;
            node = node->next;
        }
    }

    return head;
}

int main() {
    auto* node = new ListNode(1,  new ListNode(2,  new ListNode(6,  new ListNode(3))));
    auto* result = removeElements(node, 6);

    assert(result->val == 1);
    assert(result->next->val == 2);
    assert(result->next->next->val == 3);
    assert(result->next->next->next == nullptr);
}