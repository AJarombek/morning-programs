"""
https://leetcode.com/problems/find-if-path-exists-in-graph/
Author: Andrew Jarombek
Date: 12/31/2021
"""

from typing import List


class GraphPath:
    def valid_path(self, edges: List[List[int]], start: int, end: int) -> bool:
        vertex_edges = {}

        for edge in edges:
            edge_set = vertex_edges.get(edge[0], set())
            edge_set.add(edge[1])
            vertex_edges[edge[0]] = edge_set

            edge_set = vertex_edges.get(edge[1], set())
            edge_set.add(edge[0])
            vertex_edges[edge[1]] = edge_set

        return self.find_path(start, vertex_edges, set(), end)

    def find_path(self, current, vertex_edges, visited, end) -> bool:
        if current == end:
            return True

        vertices = vertex_edges.get(current)

        for vertex in vertices:
            if vertex not in visited:
                visited.add(vertex)

                if self.find_path(vertex, vertex_edges, visited, end):
                    return True

        return False
