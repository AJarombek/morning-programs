# C project to run the minStack program.
# Author: Andrew Jarombek
# Date: 2/21/2022

cmake_minimum_required(VERSION 3.9)
project(c C)

set(CMAKE_C_STANDARD 99)

add_executable(c minStack.c)