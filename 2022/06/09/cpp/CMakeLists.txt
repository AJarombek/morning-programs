# Make the C++ project to run the Max Depth program.
# Author: Andrew Jarombek
# Date: 6/9/2022

cmake_minimum_required(VERSION 3.9)
project(cpp)

set(CMAKE_CXX_STANDARD 17)

add_executable(cpp maxDepth.cpp)