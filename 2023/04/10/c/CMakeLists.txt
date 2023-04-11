# C project to run the "find the difference" program.
# Author: Andrew Jarombek
# Date: 4/10/2023

cmake_minimum_required(VERSION 3.9)
project(c C)

set(CMAKE_C_STANDARD 17)

add_executable(c findTheDifference.c)