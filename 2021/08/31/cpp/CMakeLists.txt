# Make the C++ project to run the vector class experiment.
# Author: Andrew Jarombek
# Date: 8/31/2021

cmake_minimum_required(VERSION 3.9)
project(cpp)

set(CMAKE_CXX_STANDARD 17)

add_executable(cpp main.cpp MyVector.h MyContainer.h MyVector.cpp)