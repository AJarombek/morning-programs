// Code samples based on Chapter 4 of "The C++ Programming Language"
// Author: Andrew Jarombek
// Date: 9/18/2021

#include <unordered_map>
#include <set>
#include <vector>
#include <string>
#include <cassert>
#include <iostream>

int main() {
    // Unordered Map Container Type.  Unordered Maps in C++ are Hash Tables.
    std::unordered_map<std::string, double> training_runs = {
        {"09/18/2021", 6.78},
        {"09/17/2021", 6.36},
        {"09/16/2021", 10.75},
        {"09/15/2021", 6.31},
        {"09/13/2021", 16}
    };

    assert(training_runs["09/16/2021"] == 10.75);

    // Set Container Type.
    std::set<std::string> races = {
        "New Balance 5th Avenue Mile",
        "NYRR Van Cortlandt Park XC #1",
        "NYC Marathon 18M Training Run",
        "Hartford 5K",
        "NYC Marathon"
    };

    assert(races.size() == 5);

    races.insert("NYC Marathon");
    assert(races.size() == 5);

    // Copy the contents of the Set into a Vector.
    std::vector<std::string> race_list(5);
    assert(race_list.size() == 5);
    std::cout << race_list[4] << "\n";
    assert(race_list[4] != "New Balance 5th Avenue Mile");

    std::unique_copy(races.begin(), races.end(), race_list.begin());
    assert(race_list.size() == 5);
    std::cout << race_list[4] << "\n";
    assert(race_list[4] == "New Balance 5th Avenue Mile");

    // Sort the Vector (In-Place).
    std::sort(race_list.begin(), race_list.end());
}