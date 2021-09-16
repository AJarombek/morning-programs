// Main method to test C++ templates.
// Experiment based on Chapter 3 of "The C++ Programming Language"
// Author: Andrew Jarombek
// Date: 9/16/2021

#include <cassert>
#include "LessThan.h"

int main() {
    // Function Objects
    LessThan<int> lt26 {26};
    assert(lt26(20));
    assert(!lt26(30));

    LessThan<char> ltj {'j'};
    assert(ltj('a'));
    assert(!ltj('z'));

    // Lambda Functions
    auto lt26Lambda = [&](int x){ return x < 26; };
    assert(lt26Lambda(20));
    assert(!lt26Lambda(30));

    auto ltjLambda = [&](int x){ return x < 'j'; };
    assert(ltjLambda('a'));
    assert(!ltjLambda('z'));
}