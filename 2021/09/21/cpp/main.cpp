// Code samples based on Chapter 4 of "The C++ Programming Language"
// Author: Andrew Jarombek
// Date: 9/21/2021

#include <vector>
#include <cassert>

using namespace std;

namespace andy {
    using namespace std;

    template<typename C>
    void sort(C& c)
    {
        sort(c.begin(), c.end());
    }
}

int main() {
    vector<int> v = {1, 2, 3, 4, 5};
    assert(find(v.begin(), v.end(), 3) != v.end());
    assert(find(v.begin(), v.end(), 6) == v.end());

    vector<int> w;
    for (auto p = v.begin(); p < v.end(); p++) {
        if (*p <= 3) {
            w.push_back(*p);
        }
    }

    assert(w.size() == 3);
    assert(w[0] == 1);
    assert(w[1] == 2);
    assert(w[2] == 3);

    vector<int>::iterator res = find_if(w.begin(), w.end(), [](int x) { return x % 2 == 0; });
    assert(*res == 2);

    // Sort using a custom function in a custom namespace.
    vector<int> vec = {4, 2, 3, 1};

    assert(vec[0] == 4);

    andy::sort(vec);

    assert(vec[0] == 1);
}