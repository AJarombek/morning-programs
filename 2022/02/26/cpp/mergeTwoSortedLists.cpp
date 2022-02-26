// https://leetcode.com/problems/merge-two-sorted-lists/
// Author: Andrew Jarombek
// Date: 2/26/2022

#include <cassert>

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(): val(0), next(nullptr) {}
    ListNode(int x): val(x), next(nullptr) {}
    ListNode(int x, ListNode *next): val(x), next(next) {}
};

class Solution {
public:
    static ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        if (list1 == nullptr && list2 == nullptr) {
            return nullptr;
        }

        ListNode* head = nullptr;
        if (list1 == nullptr) {
            head = new ListNode(list2->val);
            list2 = list2->next;
        } else if (list2 == nullptr) {
            head = new ListNode(list1->val);
            list1 = list1->next;
        } else if (list1->val < list2->val) {
            head = new ListNode(list1->val);
            list1 = list1->next;
        } else {
            head = new ListNode(list2->val);
            list2 = list2->next;
        }

        ListNode* node = head;

        while (list1 != nullptr && list2 != nullptr) {
            if (list1->val < list2->val) {
                node->next = new ListNode(list1->val);
                list1 = list1->next;
                node = node->next;
            } else {
                node->next = new ListNode(list2->val);
                list2 = list2->next;
                node = node->next;
            }
        }

        while (list1 != nullptr) {
            node->next = new ListNode(list1->val);
            list1 = list1->next;
            node = node->next;
        }

        while (list2 != nullptr) {
            node->next = new ListNode(list2->val);
            list2 = list2->next;
            node = node->next;
        }

        return head;
    }
};

int main() {
    auto list1 = new ListNode(1, new ListNode(3));
    auto list2 = new ListNode(2);

    auto result = Solution::mergeTwoLists(list1, list2);
    assert(result->val == 1);
    assert(result->next->val == 2);
    assert(result->next->next->val == 3);
}
