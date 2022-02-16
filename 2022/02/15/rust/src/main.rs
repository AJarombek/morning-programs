// https://leetcode.com/problems/binary-tree-inorder-traversal/
// Author: Andrew Jarombek
// Date: 2/15/2022

#[derive(Debug, PartialEq, Eq)]
pub struct TreeNode {
    pub val: i32,
    pub left: Option<Rc<RefCell<TreeNode>>>,
    pub right: Option<Rc<RefCell<TreeNode>>>
}

impl TreeNode {
    #[inline]
    pub fn new(val: i32) -> Self {
        TreeNode {
            val,
            left: None,
            right: None
        }
    }
}

use std::borrow::Borrow;
use std::rc::Rc;
use std::cell::RefCell;

struct Solution {

}

impl Solution {
    pub fn inorder_traversal(root: Option<Rc<RefCell<TreeNode>>>) -> Vec<i32> {
        let mut result: Vec<i32> = Vec::new();
        Self::dfs(root, &mut result);
        return result;
    }

    pub fn dfs(node: Option<Rc<RefCell<TreeNode>>>, result: &mut Vec<i32>) {
        if let Some(tree_node) = node {
            Self::dfs(tree_node.borrow().left.clone(), result);
            result.push(tree_node.borrow().val);
            Self::dfs(tree_node.borrow().right.clone(), result);
        }
    }
}

fn main() {
    let root: Option<Rc<RefCell<TreeNode>>> = Some(Rc::new(RefCell::new(TreeNode::new(1))));

    let solution = Solution{};
    let result: Vec<i32> = solution.inorder_traversal(root);
    assert_eq!(result[0], 1);
}
