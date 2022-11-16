// https://leetcode.com/problems/pascals-triangle/
// Author: Andrew Jarombek
// Date: 11/15/2022

#include <cassert>
#include <vector>

using namespace std;

vector<vector<int>> generate(int numRows) {
    vector<vector<int>> result {};
    result.push_back(vector<int> {1});

    if (numRows == 1)
        return result;

    result.push_back(vector<int> {1, 1});

    for (int i = 3; i <= numRows; i++) {
        auto prev = result[result.size() - 1];
        vector<int> row {1};

        for (int j = 1; j < prev.size(); j++) {
            row.push_back(prev[j] + prev[j-1]);
        }

        row.push_back(1);
        result.push_back(row);
    }

    return result;
}

int main() {
    auto result = generate(4);
    assert(result.size() == 4);
    assert(result[0].size() == 1);
    assert(result[1].size() == 2);
    assert(result[2].size() == 3);
    assert(result[3].size() == 4);

    assert(result[0][0] == 1);

    assert(result[1][0] == 1);
    assert(result[1][1] == 1);

    assert(result[2][0] == 1);
    assert(result[2][1] == 2);
    assert(result[2][2] == 1);

    assert(result[3][0] == 1);
    assert(result[3][1] == 3);
    assert(result[3][2] == 3);
    assert(result[3][3] == 1);
}