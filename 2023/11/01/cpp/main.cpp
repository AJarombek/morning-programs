// Lambda functions in C++.
// Author: Andrew Jarombek
// Date: 11/1/2023

#include <cassert>
#include <vector>

using namespace std;

int main() {
    vector<int> nums = {1, 2, 3, 4, 5, 6};

    // Filter nums using a lambda function
    // Capture the nums vector by reference using the [&] syntax
    vector<int> filtered = [&nums]() {
        vector<int> result;

        for (int num : nums) {
            if (num % 3 == 0) {
                result.push_back(num);
            }
        }

        return result;
    }();

    assert(filtered.size() == 2);
    assert(filtered[0] == 3);
    assert(filtered[1] == 6);

    // Sort the filtered list using a lambda function
    // No capture is needed since elements within the filtered vector are passed in as parameters
    sort(filtered.begin(), filtered.end(), [](int a, int b) -> bool {
        return a > b;
    });

    assert(filtered[0] == 6);
    assert(filtered[1] == 3);

    // Use a lambda function that implicitly captures by value using the [=] syntax
    int x = 10;
    int y = 20;
    auto lambda = [=]() -> int {
        return x + y;
    };

    assert(lambda() == 30);
}