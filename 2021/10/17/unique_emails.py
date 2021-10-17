"""
https://leetcode.com/problems/unique-email-addresses/
Author: Andrew Jarombek
Date: 10/17/2021
"""

from typing import List


def num_unique_emails(emails: List[str]) -> int:
    addresses = set()

    for email in emails:
        index = 0

        address = ''
        plus_section = False

        while index < len(email):
            if email[index] == '@':
                address += email[index:]
                index = len(email)
            elif email[index] == '+':
                plus_section = True
                index += 1
            elif not plus_section and email[index] != '.':
                address += email[index]
                index += 1
            else:
                index += 1

        addresses.add(address)

    return len(addresses)
