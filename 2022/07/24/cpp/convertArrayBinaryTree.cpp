// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
// Author: Andrew Jarombek
// Date: 7/24/2022

#include <vector>
#include <cassert>

using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

TreeNode* sortedArrayToBST(vector<int>& nums);
TreeNode* dfs(vector<int>& nums, int low, int high);

TreeNode* sortedArrayToBST(vector<int>& nums) {
    return dfs(nums, 0, nums.size() - 1);
}

TreeNode* dfs(vector<int>& nums, int low, int high) {
    int mid = (low + high) / 2;
    auto node = new TreeNode(nums[mid]);

    if (low < mid) {
        node->left = dfs(nums, low, mid - 1);
    }

    if (mid < high) {
        node->right = dfs(nums, mid + 1, high);
    }

    return node;
}

int main() {
    auto v = vector {1, 2, 3, 4, 5};
    auto tree = sortedArrayToBST(v);

    assert(tree->val == 3);
    assert(tree->left->val == 1);
    assert(tree->left->right->val == 2);
    assert(tree->right->val == 4);
    assert(tree->right->right->val == 5);
}