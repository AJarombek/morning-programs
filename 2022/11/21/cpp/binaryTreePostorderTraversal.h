// https://leetcode.com/problems/binary-tree-postorder-traversal/
// Author: Andrew Jarombek
// Date: 11/21/2022

#include <vector>
#include "treeNode.h"

using namespace std;

#ifndef CPP_BINARYTREEPOSTORDERTRAVERSAL_H
#define CPP_BINARYTREEPOSTORDERTRAVERSAL_H

vector<int> postorderTraversal(TreeNode* root);
void dfs(TreeNode* node, vector<int>& result);

#endif //CPP_BINARYTREEPOSTORDERTRAVERSAL_H
