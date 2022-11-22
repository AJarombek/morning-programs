// Main file to run morning programs.
// Author: Andrew Jarombek
// Date: 11/21/2022

#include <cassert>
#include "binaryTreePreorderTraversal.h"
#include "binaryTreePostorderTraversal.h"

using namespace std;

int main() {
    auto node3 = TreeNode(3);
    auto node2 = TreeNode(2, &node3, nullptr);
    auto node1 = TreeNode(1, nullptr, &node2);

    auto result = preorderTraversal(&node1);

    assert(result.size() == 3);
    assert(result[0] == 1);
    assert(result[1] == 2);
    assert(result[2] == 3);

    result = postorderTraversal(&node1);

    assert(result.size() == 3);
    assert(result[0] == 3);
    assert(result[1] == 2);
    assert(result[2] == 1);
}