# Make the C++ project to run the Add Binary program.
# Author: Andrew Jarombek
# Date: 4/8/2022

cmake_minimum_required(VERSION 3.9)
project(cpp)

set(CMAKE_CXX_STANDARD 17)

add_executable(cpp addBinary.cpp)