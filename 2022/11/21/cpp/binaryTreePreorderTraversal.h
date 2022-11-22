// https://leetcode.com/problems/binary-tree-preorder-traversal/
// Author: Andrew Jarombek
// Date: 11/21/2022

#include <vector>
#include "treeNode.h"

using namespace std;

#ifndef CPP_BINARYTREEPREORDERTRAVERSAL_H
#define CPP_BINARYTREEPREORDERTRAVERSAL_H

vector<int> preorderTraversal(TreeNode* root);
void preorderDfs(TreeNode* node, vector<int>& result);

#endif //CPP_BINARYTREEPREORDERTRAVERSAL_H
