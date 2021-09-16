# Make the C++ project to run the template experiment.
# Author: Andrew Jarombek
# Date: 9/16/2021

cmake_minimum_required(VERSION 3.9)
project(cpp)

set(CMAKE_CXX_STANDARD 17)

add_executable(cpp main.cpp LessThan.h)