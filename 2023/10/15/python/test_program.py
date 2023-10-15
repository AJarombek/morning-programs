"""
Unit tests for the clone-graph program.
Author: Andrew Jarombek
Date: 10/15/2023
"""

from program import Solution, Node


def test_clone_graph_empty():
    assert Solution.clone_graph(None) is None


def test_clone_graph():
    node1 = Node(1)
    node2 = Node(2)
    node3 = Node(3)

    node1.neighbors = [node2, node3]
    node2.neighbors = [node1, node3]
    node3.neighbors = [node1, node2]

    new_node = Solution.clone_graph(node1)
    assert new_node.val == 1
    assert new_node.neighbors[0].val == 2
    assert new_node.neighbors[1].val == 3
