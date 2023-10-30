"""
Building an iterable class in Python.
Author: Andrew Jarombek
Date: 10/30/2023
"""


class Stocks:
    def __init__(self, stocks: list[tuple[str, float, float]]):
        self.stocks = stocks
        self.index = 0

    def __iter__(self):
        self.index = 0
        return self

    def __next__(self):
        if self.index >= len(self.stocks):
            raise StopIteration

        stock = self.stocks[self.index]
        self.index += 1
        return stock


if __name__ == '__main__':
    stocks = Stocks([
        ("APPL", 170.12, 34.23),
        ("NVDA", 408.48, 36.26),
        ("PEP", 161.68, 28.42)
    ])

    for stock in stocks:
        print(stock)

    iterable = iter(stocks)
    assert next(iterable) == ("APPL", 170.12, 34.23)
    assert next(iterable) == ("NVDA", 408.48, 36.26)
    assert next(iterable) == ("PEP", 161.68, 28.42)

    try:
        next(iterable)
        assert False, "expected a StopIteration exception"
    except StopIteration:
        assert True
