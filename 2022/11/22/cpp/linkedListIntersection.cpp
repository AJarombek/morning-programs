// https://leetcode.com/problems/intersection-of-two-linked-lists/
// Author: Andrew Jarombek
// Date: 11/22/2022

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

ListNode* getIntersectionNode(ListNode *headA, ListNode *headB) {
    int a = 0;
    int b = 0;

    ListNode* nodeA = headA;
    while (nodeA != nullptr) {
        nodeA = nodeA->next;
        a++;
    }

    ListNode* nodeB = headB;
    while (nodeB != nullptr) {
        nodeB = nodeB->next;
        b++;
    }

    while (a > b) {
        headA = headA->next;
        a--;
    }

    while (b > a) {
        headB = headB->next;
        b--;
    }

    while (headA != nullptr) {
        if (headA == headB)
            return headA;

        headA = headA->next;
        headB = headB->next;
    }

    return nullptr;
}

int main() {
    auto node1 = ListNode(1);
    auto node2 = ListNode(2);
    auto node3 = ListNode(3);
    node1.next = &node3;
    node2.next = &node3;

    assert(getIntersectionNode(&node1, &node2) == &node3);
}