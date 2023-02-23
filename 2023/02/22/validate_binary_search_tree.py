import math
from typing import Optional
from collections import deque


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        if root is None:
            return False

        queue = deque([(root, -math.inf, math.inf)])

        while len(queue) > 0:
            node, low, high = queue.popleft()
            val = node.val

            if low >= val or high <= val:
                return False

            if node.left is not None:
                queue.append((node.left, low, val))

            if node.right is not None:
                queue.append((node.right, val, high))

        return True
