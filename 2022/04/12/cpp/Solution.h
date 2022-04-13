// Header file for the programs.
// Author: Andrew Jarombek
// Date: 4/12/2022

#ifndef CPP_SOLUTION_H
#define CPP_SOLUTION_H

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    explicit ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {
public:
    static int climbStairs(int n);
    static ListNode* deleteDuplicates(ListNode* head);
};


#endif //CPP_SOLUTION_H
