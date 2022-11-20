// https://leetcode.com/problems/linked-list-cycle/
// Author: Andrew Jarombek
// Date: 11/20/2022

#include <cassert>
#include <vector>
#include <set>

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode* next) : val(x), next(next) {}
};

bool hasCycle(ListNode *head) {
    ListNode* slow = head;
    ListNode* fast = head;

    while (fast != nullptr) {
        slow = slow->next;
        fast = fast->next;

        if (fast == nullptr)
            return false;

        fast = fast->next;

        if (fast == slow)
            return true;
    }

    return false;
}

int main() {
    auto node1 = ListNode(3);
    auto node2 = ListNode(2);
    auto node3 = ListNode(0);
    auto node4 = ListNode(-4);

    node1.next = &node2;
    node2.next = &node3;
    node3.next = &node4;

    assert(!hasCycle(&node1));

    node4.next = &node2;

    assert(hasCycle(&node1));
}