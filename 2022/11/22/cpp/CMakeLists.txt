# Make the C++ project to run the "Intersection of Two Linked Lists" program.
# Author: Andrew Jarombek
# Date: 11/22/2022

cmake_minimum_required(VERSION 3.9)
project(cpp)

set(CMAKE_CXX_STANDARD 17)

add_executable(cpp linkedListIntersection.cpp)