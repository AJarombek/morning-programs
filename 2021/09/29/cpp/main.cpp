// Code samples based on Chapters 5 & 6 of "The C++ Programming Language"
// Author: Andrew Jarombek
// Date: 9/29/2021

#include <cassert>
#include <regex>
#include <random>
#include <unordered_map>
#include <iostream>
#include <valarray>

using namespace std;

int main() {
    // Regular Expressions
    regex re (R"(^\d{1,3}(.\d{1,5})?$)");
    assert(regex_match("12", re));
    assert(!regex_match("12.", re));
    assert(regex_match("12.34", re));
    assert(regex_match("12.34567", re));
    assert(!regex_match("12.345678", re));

    // Random Generators
    default_random_engine engine {};
    uniform_int_distribution<> dist {1, 5};
    auto random_generator = bind(dist, engine);

    auto random_normal_generator = bind(normal_distribution<>{3, 0.8}, default_random_engine{});
    auto random_exponential_generator = bind(exponential_distribution<double>{3.5}, default_random_engine{});

    unordered_map<int, int> result = {
            {1, 0},
            {2, 0},
            {3, 0},
            {4, 0},
            {5, 0}
    };
    unordered_map<int, int> result_normal = result;
    unordered_map<int, int> result_exponential = result;

    for (int i = 0; i < 200; i++) {
        ++result[random_generator()];
    }

    for (int i = 0; i < 200; i++) {
        ++result_normal[random_normal_generator()];
    }

    for (int i = 0; i < 200; i++) {
        ++result_exponential[round(random_exponential_generator() * 5.0)];
    }

    cout << "Default Distribution:" << endl;
    for (int i = 0; i < 5; i++) {
        cout << result[i + 1] << endl;
    }
    cout << endl;

    cout << "Normal Distribution:" << endl;
    for (int i = 0; i < 5; i++) {
        cout << result_normal[i + 1] << endl;
    }
    cout << endl;

    cout << "Exponential Distribution:" << endl;
    for (int i = 0; i < 5; i++) {
        cout << result_exponential[i + 1] << endl;
    }

    // Vector Arithmetic (think numpy in Python).  ValArray is optimized for vector arithmetic; use it instead of Vector.
    valarray<int> arr = {1, 2, 3};
    arr *= 2;

    assert(arr[0] == 2);
    assert(arr[1] == 4);
    assert(arr[2] == 6);

    // Types: Boolean
    // Boolean types are integral types, and can be passed integers.  0 is false, nonzero is true.
    bool a = 1;
    bool b = 0;
    assert(a == true);
    assert(b == false);

    // The reverse is also true
    int c = a;
    int d = b;
    assert(c == 1);
    assert(d == 0);

    // Arithmetic with booleans
    int e = true + true;
    int f = true + false;
    int g = true - true;
    assert(e == 2);
    assert(f == 1);
    assert(g == 0);
}