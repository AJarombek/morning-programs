# C project to run the numberOfOneBits program.
# Author: Andrew Jarombek
# Date: 3/26/2022

cmake_minimum_required(VERSION 3.9)
project(c C)

set(CMAKE_C_STANDARD 99)

add_executable(c numberOfOneBits.c)