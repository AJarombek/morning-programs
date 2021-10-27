from typing import List


# Works on all lists
def can_three_parts_equal_sum(arr: List[int]) -> bool:
    count = sum(arr)

    if count % 3 != 0:
        return False

    part_count = count / 3

    parts = 0
    part = 0

    for i in range(len(arr)):
        part += arr[i]

        if part == part_count:
            parts += 1
            part = 0

    return parts >= 3


# Works on smaller lists
def can_three_parts_equal_sum_v1(arr: List[int]) -> bool:
    first = 0
    second_found = False

    for i in range(len(arr) - 2):
        first += arr[i]
        second_found = False

        index = i + 1
        second = 0

        while index < len(arr) and not second_found:
            second += arr[index]

            if second == first:
                second_found = True

            index += 1

        if index < len(arr):
            third = 0

            while index < len(arr):
                third += arr[index]
                index += 1

            if third == first:
                return True

    return False
