// Variable arguments in C++ using an initializer list.
// Author: Andrew Jarombek
// Date: 10/31/2023

#include <cassert>
#include <initializer_list>
#include <iostream>

using namespace std;

double std_dev(initializer_list<int> list) {
    int sum = 0;
    int count = 0;

    for (auto& i : list) {
        sum += i;
        count++;
    }

    double mean = (double) sum / count;
    double sum_of_squares = 0;

    for (auto& i : list) {
        sum_of_squares += (i - mean) * (i - mean);
    }

    double variance = sum_of_squares / count;
    return sqrt(variance);
}

int main() {
    double result = std_dev({1, 2, 3, 4, 5});
    double expected = 1.41421;

    cout << result << endl;
    assert(abs(result - expected) < 0.00001);
}