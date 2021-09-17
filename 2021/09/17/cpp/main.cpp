// Code samples based on Chapters 3 and 4 of "The C++ Programming Language"
// Author: Andrew Jarombek
// Date: 9/17/2021

#include <vector>
#include <list>
#include <map>
#include <string>
#include <cassert>

template<typename T>
void g(T val, std::vector<T>& vec)
{
    vec.push_back(val);
}


template<typename T>
void f(std::vector<T>& v) {}


template<typename T, typename... Tail>
void f(std::vector<T>& v, T head, Tail... tail)
{
    g(head, v);
    f(v, tail...);
}

int main() {
    // Variadic Templates
    std::vector<int> v;
    f(v, 1, 2, 3, 4, 5);

    assert(v.size() == 5);
    assert(v[0] == 1);
    assert(v[4] == 5);

    // Aliases
    using UIntVector = std::vector<uint32_t>;
    UIntVector uint_vector = {0, 5, 10};
    assert(uint_vector.size() == 3);

    // List Container Type.  Lists in C++ are doubly linked lists (like LinkedList in Java).
    std::string andy = "Andy";
    std::list<std::string> words = {andy, "Jarombek"};

    // Map Container Type.  Maps in C++ are red-black trees.
    std::map<std::string, double> race_distances = {
        {"New Balance 5th Avenue Mile", 1},
        {"NYRR Van Cortlandt Park XC #1", 3.1},
        {"NYC Marathon 18M Training Run", 18},
        {"Hartford 5K", 3.1},
        {"NYC Marathon", 26.2}
    };

    assert(race_distances["NYC Marathon"] == 26.2);

    race_distances["Manchester Road Race"] = 4.75;
    assert(race_distances["Manchester Road Race"] == 4.75);
}