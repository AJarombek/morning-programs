"""
https://leetcode.com/problems/design-hashset/
Author: Andrew Jarombek
Date: 10/3/2021
"""


class MyHashSet:

    def __init__(self):
        self.items = [[] for i in range(1000)]

    def add(self, key: int) -> None:
        index_list = self.items[key % 1000]
        if key not in index_list:
            index_list.append(key)

    def remove(self, key: int) -> None:
        index_list = self.items[key % 1000]

        try:
            index_list.remove(key)
        except:
            pass

    def contains(self, key: int) -> bool:
        index_list = self.items[key % 1000]
        return key in index_list
