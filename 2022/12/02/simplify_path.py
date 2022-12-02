"""
https://leetcode.com/problems/simplify-path/
Author: Andrew Jarombek
Date: 12/2/2022
"""


def simplify_path(path: str) -> str:
    chars = [c for c in path]
    prev = ''

    for i, c in enumerate(chars):
        if prev == '/' and c == '/':
            chars[i] = ''

        prev = c

    path = ''.join(chars)
    result = []

    for section in path.split("/"):
        if section == '..':
            result = result[:-1]
        elif section != '.' and section != '':
            result.append(section)

    final_path = '/' + '/'.join(result)
    return '/' if len(final_path) == 0 else final_path


if __name__ == '__main__':
    assert simplify_path('/home/') == '/home'
    assert simplify_path('/../') == '/'
    assert simplify_path('/home//for//christmas//tree//lot') == '/home/for/christmas/tree/lot'
