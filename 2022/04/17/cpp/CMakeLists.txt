# Make the C++ project to run the Same Tree program.
# Author: Andrew Jarombek
# Date: 4/17/2022

cmake_minimum_required(VERSION 3.9)
project(cpp)

set(CMAKE_CXX_STANDARD 17)

add_executable(cpp sameTree.cpp)