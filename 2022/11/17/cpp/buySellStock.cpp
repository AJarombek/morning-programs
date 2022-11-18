// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Author: Andrew Jarombek
// Date: 11/17/2022

#include <cassert>
#include <vector>

using namespace std;

int maxProfit(vector<int>& prices) {
    int result = 0;

    if (prices.empty())
        return result;

    int minimum = prices[0];
    int maximum = minimum;

    for (int i = 1; i < prices.size(); i++) {
        int val = prices[i];

        if (val < minimum) {
            minimum = val;
            maximum = val;
        } else if (val > maximum) {
            maximum = val;
            result = max(result, maximum - minimum);
        }
    }

    return result;
}

int main() {
    vector<int> v {7, 1, 5, 3, 6, 4};
    auto result = maxProfit(v);
    assert(result == 5);

    vector<int> v2 {7, 6, 4, 3, 1};
    auto result2 = maxProfit(v2);
    assert(result2 == 0);
}