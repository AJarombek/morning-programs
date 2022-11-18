# Make the C++ project to run the "Buy Sell Stock" program.
# Author: Andrew Jarombek
# Date: 11/17/2022

cmake_minimum_required(VERSION 3.9)
project(cpp)

set(CMAKE_CXX_STANDARD 17)

add_executable(cpp buySellStock.cpp)