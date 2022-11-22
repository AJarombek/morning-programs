// Tree node struct used in morning programs.
// Author: Andrew Jarombek
// Date: 11/21/2022

#ifndef CPP_TREENODE_H
#define CPP_TREENODE_H

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

#endif //CPP_TREENODE_H
