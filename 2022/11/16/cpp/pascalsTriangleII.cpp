// https://leetcode.com/problems/pascals-triangle-ii/
// Author: Andrew Jarombek
// Date: 11/16/2022

#include <cassert>
#include <vector>

using namespace std;

vector<int> getRow(int rowIndex) {
    vector<int> v (rowIndex + 1, 1);

    for (int i = 2; i <= rowIndex; i++) {
        for (int j = i - 1; j >= 1; j--) {
            v[j] = v[j] + v[j-1];
        }
    }

    return v;
}

int main() {
    auto result = getRow(3);
    assert(result.size() == 4);

    assert(result[0] == 1);
    assert(result[1] == 3);
    assert(result[2] == 3);
    assert(result[3] == 1);
}