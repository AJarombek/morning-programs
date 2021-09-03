# C project to run the longest common prefix program.
# Author: Andrew Jarombek
# Date: 9/3/2021

cmake_minimum_required(VERSION 3.9)
project(c C)

set(CMAKE_C_STANDARD 99)

add_executable(c longestCommonPrefix.c)