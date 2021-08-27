# C project to run the roman numeral to integer program.
# Author: Andrew Jarombek
# Date: 8/27/2021

cmake_minimum_required(VERSION 3.9)
project(c C)

set(CMAKE_C_STANDARD 99)

add_executable(c roman_to_integer.c)