from typing import List


def has_groups_size_x(deck: List[int]) -> bool:
    suits = {}

    for card in deck:
        if card in suits:
            suits[card] = suits[card] + 1
        else:
            suits[card] = 1

    for i in range(2, len(deck) + 1):
        result = True
        for key in suits.keys():
            if suits[key] % i != 0:
                result = False

        if result is True:
            return True

    return False


if __name__ == '__main__':
    assert has_groups_size_x([1, 1])
