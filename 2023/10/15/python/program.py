"""
https://leetcode.com/problems/clone-graph/
Author: Andrew Jarombek
Date: 10/15/2023
"""


class Node:
    def __init__(self, val=0, neighbors=None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []


class Solution:
    @staticmethod
    def clone_graph(node: Node | None) -> Node | None:
        if node is None:
            return None

        visited = {}

        def dfs(node: Node) -> Node:
            if node.val in visited:
                return visited[node.val]

            new_node = Node(node.val)
            visited[node.val] = new_node

            for neighbor in node.neighbors:
                new_node.neighbors.append(dfs(neighbor))

            return new_node

        return dfs(node)
