// Main method for testing programs
// Author: Andrew Jarombek
// Date: 4/12/2022

#include <cassert>
#include "Solution.h"

using namespace std;

int main() {
    assert(Solution::climbStairs(3) == 3);

    auto node = new ListNode(1, new ListNode(1, new ListNode(2)));
    auto result = Solution::deleteDuplicates(node);
    assert(result->val == 1);
    assert(result->next->val == 2);
}