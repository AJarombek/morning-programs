"""
https://leetcode.com/problems/unique-email-addresses/
Author: Andrew Jarombek
Date: 5/24/2022
"""

from typing import List


def num_unique_emails(emails: List[str]) -> int:
    cleaned_emails = set()

    for email in emails:
        parts = email.split('@')
        local = parts[0].split('+')[0]
        domain = parts[1]

        cleaned_local = []

        for c in local:
            if c != '.':
                cleaned_local.append(c)

        cleaned_emails.add(f"{''.join(cleaned_local)}@{domain}")

    return len(cleaned_emails)
