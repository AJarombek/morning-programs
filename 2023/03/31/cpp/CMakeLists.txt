# Make the C++ project to run the "Contains Duplicate" program.
# Author: Andrew Jarombek
# Date: 3/31/2023

cmake_minimum_required(VERSION 3.9)
project(cpp)

set(CMAKE_CXX_STANDARD 17)

add_executable(cpp containsDuplicate.cpp)