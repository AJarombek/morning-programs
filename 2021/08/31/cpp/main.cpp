// Main method to test the vector class.
// Experiment based on Chapter 3 of "The C++ Programming Language"
// Author: Andrew Jarombek
// Date: 8/31/2021

#include "MyVector.h"

int main() {
    MyVector myVector = {1, 2, 3, 4, 5};
    assert(myVector.size() == 5);
    assert(myVector[4] == 5);

    myVector.push(6);
    assert(myVector.size() == 6);
    assert(myVector[5] == 6);
}