// Program: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Author: Andrew Jarombek
// Date: 2/14/2022

#include <stdlib.h>
#include <assert.h>

int maxProfit(int* prices, int pricesSize){
    int max = 0;
    int low = prices[0];

    for (int i = 1; i < pricesSize; i++) {
        int val = prices[i];
        int gain = val - low;

        if (gain > max) {
            max = gain;
        }

        if (val < low) {
            low = val;
        }
    }

    return max;
}

int main() {
    int* chart = (int*) malloc(sizeof(int) * 6);
    chart[0] = 7;
    chart[1] = 1;
    chart[2] = 5;
    chart[3] = 3;
    chart[4] = 6;
    chart[5] = 4;

    assert(maxProfit(chart, 6) == 5);

    free(chart);
}
