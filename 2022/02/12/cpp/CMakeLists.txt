# Make the C++ project to run the Valid Parentheses & Remove Element programs.
# Author: Andrew Jarombek
# Date: 2/12/2022

cmake_minimum_required(VERSION 3.9)
project(cpp)

set(CMAKE_CXX_STANDARD 17)

add_executable(cpp validParentheses.cpp removeElement.cpp)