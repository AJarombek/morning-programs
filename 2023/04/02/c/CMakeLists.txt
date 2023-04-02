# C project to run the "reverse string" program.
# Author: Andrew Jarombek
# Date: 4/2/2023

cmake_minimum_required(VERSION 3.9)
project(c C)

set(CMAKE_C_STANDARD 99)

add_executable(c reverseString.c)