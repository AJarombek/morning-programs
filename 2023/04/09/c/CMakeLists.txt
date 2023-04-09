# C project to run the "first unique character" program.
# Author: Andrew Jarombek
# Date: 4/9/2023

cmake_minimum_required(VERSION 3.9)
project(c C)

set(CMAKE_C_STANDARD 17)

add_executable(c firstUniqueChar.c)