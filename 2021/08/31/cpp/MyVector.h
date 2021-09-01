// Define a vector class, which is a subclass of the abstract container class.
// Author: Andrew Jarombek
// Date: 8/31/2021

#include "MyContainer.h"
#include <vector>

#ifndef CPP_MYVECTOR_H
#define CPP_MYVECTOR_H

using namespace std;

class MyVector: public MyContainer {
    vector<double> v;
public:
    MyVector(initializer_list<double>);
    void push(double);

    double& operator[](int) override;
    int size() const override;
};

#endif //CPP_MYVECTOR_H
