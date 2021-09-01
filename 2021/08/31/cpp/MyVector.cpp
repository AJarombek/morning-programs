// Function implementations for the vector class.
// Author: Andrew Jarombek
// Date: 8/31/2021

#include "MyVector.h"

MyVector::MyVector(initializer_list<double> list) {
    v.assign(list);
}

void MyVector::push(double value) {
    v.push_back(value);
}

double &MyVector::operator[](int i) {
    return v[i];
}

int MyVector::size() const {
    return v.size();
}
