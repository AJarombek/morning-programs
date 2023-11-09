// https://leetcode.com/problems/palindrome-linked-list/
// Author: Andrew Jarombek
// Date: 11/8/2023

#include <cassert>

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {
public:
    static bool isPalindrome(ListNode* head) {
        auto fast = head;
        auto slow = head;

        while (fast != nullptr && fast->next != nullptr) {
            fast = fast->next->next;
            slow = slow->next;
        }

        auto second = reverse(slow);
        auto first = head;

        while (second != nullptr) {
            if (first->val != second->val) {
                return false;
            }

            first = first->next;
            second = second->next;
        }

        return true;
    }

    static ListNode* reverse(ListNode* head) {
        ListNode* prev = nullptr;
        ListNode* curr = head;

        while (curr != nullptr) {
            ListNode* next = curr->next;
            curr->next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
};

int main() {
    auto* head1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
    auto* head2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1)))));
    auto* head3 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(2, new ListNode(1))))));
    auto* head4 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(2))));

    assert(Solution::isPalindrome(head1));
    assert(Solution::isPalindrome(head2));
    assert(Solution::isPalindrome(head3));
    assert(!Solution::isPalindrome(head4));

    return 0;
}
