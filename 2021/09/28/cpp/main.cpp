// Code samples based on Chapter 5 of "The C++ Programming Language"
// Author: Andrew Jarombek
// Date: 9/28/2021

#include <limits>
#include <cassert>
#include <string>

using namespace std;

int main() {
    constexpr char min = numeric_limits<char>::min();
    static_assert(min == -128, "Minimum value for type 'char' is -128.");
    assert(min == -128);

    constexpr char max = numeric_limits<char>::max();
    static_assert(max == 127, "Maximum value for type 'char' is 127.");
    assert(max == 127);

    // Type 'char' is 1 byte (8 bits).
    assert(sizeof(char) == 1);

    // The standard library has type predicates which help gain information about types.
    bool intArithmetic = is_arithmetic<int>();
    bool charArithmetic = is_arithmetic<char>();
    bool boolArithmetic = is_arithmetic<string>();
    assert(intArithmetic);
    assert(charArithmetic);
    assert(!boolArithmetic);

    // Pairs
    auto andy = make_pair("Andy", 26);
    assert(andy.first == "Andy");
    assert(andy.second == 26);

    // Tuples
    auto upcomingRaces = make_tuple("NYC Marathon 18 Mile Training Run", "Hartford 5K", "NYC Marathon");
    string race1 = get<0>(upcomingRaces);
    string race2 = get<1>(upcomingRaces);
    string race3 = get<2>(upcomingRaces);
    assert(race1 == "NYC Marathon 18 Mile Training Run");
    assert(race2 == "Hartford 5K");
    assert(race3 == "NYC Marathon");
}