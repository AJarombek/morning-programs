# C project to run the "string is subsequence" program.
# Author: Andrew Jarombek
# Date: 4/11/2023

cmake_minimum_required(VERSION 3.9)
project(c C)

set(CMAKE_C_STANDARD 17)

add_executable(c isSubsequence.c)