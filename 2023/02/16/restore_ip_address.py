"""
https://leetcode.com/problems/restore-ip-addresses/
Author: Andrew Jarombek
Date: 2/16/2023
"""

from typing import List


class Solution:
    def restore_ip_addresses(self, s: str) -> List[str]:
        result = self.build_ip_address(s, 0, 0, "")
        return [ip[1:] for ip in result]

    def build_ip_address(self, s: str, index: int, x: int, ip: str) -> List[str]:
        if x == 4:
            return [ip]

        result = []
        length = len(s)

        for i in range(3):
            if index + i < length - 3 + x and index + i + 1 >= length - (3 * (3 - x)):
                val = s[index:index + i + 1]

                if len(val) > 1 and val[0] == '0':
                    continue

                if int(val) > 255:
                    continue

                result.extend(
                    self.build_ip_address(s, index + i + 1, x + 1, f"{ip}.{val}")
                )

        return result
