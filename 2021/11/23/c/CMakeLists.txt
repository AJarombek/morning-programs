# C project to run the searchInsert program.
# Author: Andrew Jarombek
# Date: 11/23/2021

cmake_minimum_required(VERSION 3.9)
project(c C)

set(CMAKE_C_STANDARD 99)

add_executable(c searchInsert.c)