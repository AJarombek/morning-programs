// https://leetcode.com/problems/reverse-linked-list/
// Author: Andrew Jarombek
// Date: 3/30/2023

#include <cassert>

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

ListNode* reverseList(ListNode* head) {
    if (head == nullptr || head->next == nullptr)
        return head;

    auto* node = head->next;
    auto* prev = head;

    while (node != nullptr) {
        auto* newHead = node;
        auto* newNext = node->next;

        newHead->next = head;
        head = newHead;

        prev->next = newNext;
        node = newNext;
    }

    return head;
}

int main() {
    auto* node = new ListNode(1,  new ListNode(2));
    auto* result = reverseList(node);

    assert(result->val == 2);
    assert(result->next->val == 1);
    assert(result->next->next == nullptr);
}