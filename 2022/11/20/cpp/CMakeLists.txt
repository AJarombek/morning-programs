# Make the C++ project to run the "Linked List Has Cycle" program.
# Author: Andrew Jarombek
# Date: 11/20/2022

cmake_minimum_required(VERSION 3.9)
project(cpp)

set(CMAKE_CXX_STANDARD 17)

add_executable(cpp linkedListCycle.cpp)