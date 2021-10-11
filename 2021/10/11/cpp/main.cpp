// Code samples based on Chapter 7 of "The C++ Programming Language"
// Author: Andrew Jarombek
// Date: 10/11/2021

#include <cassert>
#include <string>
#include <iostream>

using namespace std;

void increment(int* ip) {
    *ip = *ip + 1;
}

void squared(int* ip) {
    *ip = *ip * *ip;
}

void apply(int* ip, void(*fp)(int*)) {
    fp(ip);
}

int main() {
    int i = 1;
    increment(&i);
    assert(i == 2);

    apply(&i, &increment);
    assert(i == 3);

    apply(&i, &squared);
    assert(i == 9);

    void* vp = nullptr;
    vp = &i;

    squared(static_cast<int*>(vp));
    assert(i == 81);

    // If arrays are specified with a larger size than the initialized list,
    // the additional spaces are given default values.
    int arr[3] {1, 2};
    assert(arr[0] == 1);
    assert(arr[1] == 2);
    assert(arr[2] == 0);

    // Strings can be split onto multiple lines
    string s1 = "Andy"
                " Jarombek";
    assert(s1 == "Andy Jarombek");

    // Looping through an array when you know its length.
    for (int index = 0; index < 3; index++) {
        cout << index << ", " << arr[index] << "\n";
        increment(&arr[index]);
    }

    assert(arr[0] == 2 && arr[1] == 3 && arr[2] == 1);

    // If you know the length of the array, you can use a range-for (for-each in Java) loop.
    int index = 0;
    for (int value : arr) {
        arr[index] = ++value;
        index++;
    }

    assert(arr[0] == 3 && arr[1] == 4 && arr[2] == 2);

    // Character array.
    char c1[] = "Andrew";

    // Pointer to a character.
    char* c2 = c1;

    // Constant character pointer.
    const char* c3 = "Andrew";

    // Constant pointer to a character.
    char *const c4 = c1;

    // Constant pointer to a constant character.
    const char *const c5 = "Andrew";

    // Allowed
    c1[0] = 'a';
    assert(strcmp(c1, "andrew") == 0);

    // Allowed
    c2[0] = 'A';
    assert(strcmp(c2, "Andrew") == 0);

    // Not allowed
    // c3[0] = 'a';
    assert(strcmp(c3, "Andrew") == 0);

    // Allowed
    c4[0] = 'a';
    assert(strcmp(c4, "andrew") == 0);

    // Not allowed
    // c5[0] = 'a';
    assert(strcmp(c5, "Andrew") == 0);

    // Allowed (the pointer isn't constant, just the value it is pointing to)
    c3 = c2;

    // Not Allowed (the pointer itself is constant.  It cant point to another memory address)
    // c4 = c2;
    // c5 = c2;
}