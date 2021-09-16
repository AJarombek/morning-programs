// LessThan function object header file.
// Author: Andrew Jarombek
// Date: 9/16/2021

#ifndef CPP_LESSTHAN_H
#define CPP_LESSTHAN_H


template<typename T>
class LessThan {
    const T val;
public:
    explicit LessThan(const T& v) :val(v) {}
    bool operator()(const T& x) const { return x < val; }
};


#endif //CPP_LESSTHAN_H
