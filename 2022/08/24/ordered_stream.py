"""
https://leetcode.com/problems/design-an-ordered-stream/
Author: Andrew Jarombek
Date: 8/24/2022
"""

from typing import List


class OrderedStream:

    def __init__(self, n: int):
        self.ptr = 0
        self.list = ["" for _ in range(n)]

    def insert(self, id_key: int, value: str) -> List[str]:
        self.list[id_key - 1] = value

        result = []
        while self.ptr < len(self.list) and len(self.list[self.ptr]) > 0:
            result.append(self.list[self.ptr])
            self.ptr += 1

        return result


if __name__ == '__main__':
    # ["OrderedStream","insert","insert","insert","insert","insert"]
    # [[5],[3,"ccccc"],[1,"aaaaa"],[2,"bbbbb"],[5,"eeeee"],[4,"ddddd"]]
    os = OrderedStream(n=5)
    assert os.insert(3, "ccccc") == []
    assert os.insert(1, "aaaaa") == ["aaaaa"]
    assert os.insert(2, "bbbbb") == ["bbbbb", "ccccc"]
    assert os.insert(5, "eeeee") == []
    assert os.insert(4, "ddddd") == ["ddddd", "eeeee"]
