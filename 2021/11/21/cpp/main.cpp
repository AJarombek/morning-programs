// Code samples based on Chapter 7 of "The C++ Programming Language"
// Author: Andrew Jarombek
// Date: 11/21/2021

#include <cassert>
#include <string>

using namespace std;

void increment(int& i)
{
    i++;
}

template<typename T>
void swap_1(T& a, T& b)
{
    T temp {a};
    a = b;
    b = temp;
}

template<typename T>
void swap_2(T& a, T& b)
{
    T temp {static_cast<T&&>(a)};
    a = static_cast<T&&>(b);
    b = static_cast<T&&>(temp);
}

template<typename T>
void swap_3(T& a, T& b)
{
    T temp {move(a)};
    a = move(b);
    b = move(temp);
}

int main() {
    double x {11.21};

    // double& can be read as 'a reference to a double'.  Altering the reference will mutate the underlying value.
    double& y = x;

    // For example, changing y will also change x.
    y += 2;
    assert(y == 13.21);
    assert(x == 13.21);

    double z = x;
    assert(z == 13.21);

    // However, changing z will NOT change x because it is a copy of x, not a reference to x.
    z -= 2;
    assert(z == 11.21);
    assert(x == 13.21);

    int i = 0;
    increment(i);
    assert(i == 1);

    string a = {"Andy"};
    string& b = a;
    string&& c = {"Andy"};

    // Error: rvalue reference (string&&) can't be bound to a lvalue reference (string&)
    // string&& d = b;

    string first {"Andy"};
    string last {"Jarombek"};

    swap_1(first, last);
    assert(first == "Jarombek");
    assert(last == "Andy");

    swap_2(first, last);
    assert(first == "Andy");
    assert(last == "Jarombek");

    swap_3(first, last);
    assert(first == "Jarombek");
    assert(last == "Andy");
}