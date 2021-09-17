# Make the C++ project to run code samples from Chapters 3 and 4.
# Author: Andrew Jarombek
# Date: 9/17/2021

cmake_minimum_required(VERSION 3.9)
project(cpp)

set(CMAKE_CXX_STANDARD 17)

add_executable(cpp main.cpp)