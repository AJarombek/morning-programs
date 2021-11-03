# C project to run the strStr program.
# Author: Andrew Jarombek
# Date: 11/2/2021

cmake_minimum_required(VERSION 3.9)
project(c C)

set(CMAKE_C_STANDARD 99)

add_executable(c strStr.c)