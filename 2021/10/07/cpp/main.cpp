// Code samples based on Chapter 6 of "The C++ Programming Language"
// Author: Andrew Jarombek
// Date: 10/7/2021

#include <limits>
#include <cassert>

using namespace std;

int main() {
    constexpr unsigned char uc_min = numeric_limits<unsigned char>::min();
    static_assert(uc_min == 0, "Minimum Value of type 'unsigned char' is 0.");

    constexpr unsigned char uc_max = numeric_limits<unsigned char>::max();
    static_assert(uc_max == 255, "Maximum Value of type 'unsigned char' is 255.");

    constexpr signed char sc_min = numeric_limits<signed char>::min();
    static_assert(sc_min == -128, "Minimum Value of type 'signed char' is -128.");

    constexpr signed char sc_max = numeric_limits<signed char>::max();
    static_assert(sc_max == 127, "Maximum Value of type 'signed char' is 127.");

    // Char type aliases (denoted by the '_t' suffix) are designed to be cross platform, while the sizes of built in
    // character types are machine dependent.
    static_assert(sizeof(wchar_t) == 4);
    static_assert(sizeof(char16_t) == 2);
    static_assert(sizeof(char32_t) == 4);

    char b = static_cast<char>('a' + 1);
    assert(b == 'b');

    int b_int = 'a' + 1;
    assert(b_int == 98);

    // Integer types.
    static_assert(sizeof(short) == 2);
    static_assert(sizeof(int) == 4);
    static_assert(sizeof(long) == 8);
    static_assert(sizeof(long long) == 8, "'long long' is not guaranteed to be longer than 'long'.");

    // Floating point types.
    static_assert(sizeof(float) == 4);
    static_assert(sizeof(double) == 8);
    static_assert(sizeof(long double) == 16);

    // Integer types also have type aliases.
    static_assert(sizeof(int_fast64_t) == 8);

    // Newest (as of C++ 11) and preferred variable initialization approach.
    // Other approaches include: int i = {10}, int i = 10, int i(10)
    int i {10};
    assert(i == 10);

    // The size of a boolean is 1 byte (8 bits), even though it really only requires 1 bit of storage
    // (0 - false, 1 - true).  This makes it the same size as 'char' in memory.
    static_assert(sizeof(bool) == 1);
}
