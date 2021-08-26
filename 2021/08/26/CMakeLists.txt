# C project to run the palindrome number program.
# Author: Andrew Jarombek
# Date: 8/26/2021

cmake_minimum_required(VERSION 3.9)
project(c C)

set(CMAKE_C_STANDARD 99)

add_executable(c palindrome_number.c)