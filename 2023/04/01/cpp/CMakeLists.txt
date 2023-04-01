# Make the C++ project to run the "Contains Duplicate II" program.
# Author: Andrew Jarombek
# Date: 4/1/2023

cmake_minimum_required(VERSION 3.9)
project(cpp)

set(CMAKE_CXX_STANDARD 17)

add_executable(cpp containsNearbyDuplicate.cpp)