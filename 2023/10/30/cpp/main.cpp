// Variable arguments in C++.
// Author: Andrew Jarombek
// Date: 10/30/2023

#include <cassert>
#include <cstdarg>

using namespace std;

int avg(int count, int values ...) {
    va_list args;
    va_start(args, values);

    int sum = values;

    for (int i = 0; i < count - 1; i++) {
        sum += va_arg(args, int);
    }

    va_end(args);
    return sum / count;
}

int main() {
    assert(avg(5, 1, 2, 3, 4, 5) == 3);
}