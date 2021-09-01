// Define a container class, which is an abstract type.
// Author: Andrew Jarombek
// Date: 8/31/2021

#include <initializer_list>

#ifndef CPP_MYCONTAINER_H
#define CPP_MYCONTAINER_H

class MyContainer {
public:
    virtual double& operator[](int) = 0;
    virtual int size() const = 0;
    virtual ~MyContainer() = default;
};

#endif //CPP_MYCONTAINER_H
